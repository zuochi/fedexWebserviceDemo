package com.fedex.soapsamples.util;

import com.fedex.track.stub.*;

import java.io.IOException;
import java.util.*;

/** 
 * Demo of using the Track service with Axis 
 * to track a shipment.
 * <p>
 * com.fedex.track.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.track.stub http://www.fedex.com/...../TrackService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class TrackWebServiceClient {

	private final static Properties config = new Properties();

	static {
		try {
			config.load(TrackWebServiceClient.class.getClassLoader().getResourceAsStream("fedex.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static TrackReply getTrackReply(String trackNum, String customerId) throws Exception {

	    TrackRequest request = new TrackRequest();

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());

        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId(customerId); //This is a reference field for the customer.  Any value can be used and will be provided in the response.
        request.setTransactionDetail(transactionDetail);

        VersionId versionId = new VersionId( "trck", 9, 0, 0);
        request.setVersion(versionId);

        TrackPackageIdentifier packageIdentifier=new TrackPackageIdentifier();
        packageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);
		packageIdentifier.setValue(trackNum);

		TrackSelectionDetail selectionDetail=new TrackSelectionDetail();
        selectionDetail.setPackageIdentifier(packageIdentifier);

        TrackRequestProcessingOptionType processingOption=TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS;

		request.setSelectionDetails(new TrackSelectionDetail[] {selectionDetail});
        request.setProcessingOptions(new TrackRequestProcessingOptionType[]{processingOption});

		try {
			// Initializing the service
			TrackServiceLocator service = new TrackServiceLocator();;
			TrackPortType port = service.getTrackServicePort();

			updateEndPoint(service);

			TrackReply reply = port.track(request); // This is the call to the web service passing in a request object and returning a reply object

			if (isResponseOk(reply.getHighestSeverity())) {// check if the call was successful

//				System.out.println("--Track Reply--");
//				if(TrackWebServiceClient.printNotifications(reply.getNotifications())){
//					TrackWebServiceClient.printCompletedTrackDetail(reply.getCompletedTrackDetails());
//				}
//				System.out.println("--Track Reply--");

				return reply;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	private static void printCompletedTrackDetail(CompletedTrackDetail[] ctd){
		for (int i=0; i< ctd.length; i++) { // package detail information
			boolean cont=true;
			System.out.println("--Completed Tracking Detail--");
			if(ctd[i].getNotifications()!=null){
				System.out.println("  Completed Track Detail Notifications--");
				cont=printNotifications(ctd[i].getNotifications());
				System.out.println("  Completed Track Detail Notifications--");
			}
			if(cont){
				print("DuplicateWayBill", ctd[i].getDuplicateWaybill());
				print("Track Details Count", ctd[i].getTrackDetailsCount());
				if(ctd[i].getMoreData()){
					System.out.println("  Additional package data not yet retrieved");
					if(ctd[i].getPagingToken()!=null){
						print("  Paging Token", ctd[i].getPagingToken());
					}
				}
				printTrackDetail(ctd[i].getTrackDetails());				
			}
			System.out.println("--Completed Tracking Detail--");
			System.out.println();
		}
	}

	private static void printTrackDetail(TrackDetail[] td){
		for (int i=0; i< td.length; i++) {
			boolean cont=true;
			System.out.println("--Track Details--");
			if(td[i].getNotification()!=null){
				System.out.println("  Track Detail Notification--");
				cont=printNotifications(td[i].getNotification());
				System.out.println("  Track Detail Notification--");
			}
			if(cont){
				print("Tracking Number", td[i].getTrackingNumber());
				print("Carrier code", td[i].getCarrierCode());
				if(td[i].getService()!=null){
					if(td[i].getService().getType()!=null && 
							td[i].getService().getDescription()!=null){
						print("Service", td[i].getService().getType());
						print("Description", td[i].getService().getDescription());
					}
				}
				if(td[i].getOtherIdentifiers()!=null){
					System.out.println("--Track Package Identifer--");
					printTrackOtherIdentifierDetail(td[i].getOtherIdentifiers());
					System.out.println("--Track Package Identifer--");
				}
				if(td[i].getStatusDetail()!=null){
					System.out.println("--Status Details--");
					printStatusDetail(td[i].getStatusDetail());
					System.out.println("--Status Details--");
				}
				if(td[i].getOriginLocationAddress()!=null){
					System.out.println("--Origin Location--");
					print(td[i].getOriginLocationAddress());
					System.out.println("--Origin Location--");
				}
				if(td[i].getDestinationAddress()!=null){
					System.out.println("--Destination Location--");
					printDestinationInformation(td[i]);
					System.out.println("--Destination Location--");
				}
				if(td[i].getActualDeliveryAddress()!=null){
					System.out.println("--Delivery Address--");
					print(td[i].getActualDeliveryAddress());
					System.out.println("--Delivery Address--");
				}
				if(td[i].getActualDeliveryTimestamp()!=null){
					System.out.println("Delivery Date");
					print(td[i].getActualDeliveryTimestamp());
				}
				if(td[i].getAppointmentDeliveryTimestamp()!=null){
					System.out.println("Appointment Date");
					print(td[i].getAppointmentDeliveryTimestamp());
				}
				if(td[i].getCommitmentTimestamp()!=null){
					System.out.println("Commitment Date");
					print(td[i].getCommitmentTimestamp());
				}
				if(td[i].getDeliveryAttempts().shortValue()>0){
					System.out.println("--Delivery Information--");
					printDeliveryInformation(td[i]);
					System.out.println("--Delivery Information--");
				}
				if(td[i].getCustomerExceptionRequests()!=null){
					System.out.println("--Customer Exception Information--");
					printCustomerExceptionRequests(td[i].getCustomerExceptionRequests());
					System.out.println("--Customer Exception Information--");
				}
				if(td[i].getCharges()!=null){
					System.out.println("--Charges--");
					printCharges(td[i].getCharges());
					System.out.println("--Charges--");
				}
				if(td[i].getEvents()!=null){
					System.out.println("--Tracking Events--");
					printTrackEvents(td[i].getEvents());
					System.out.println("--Tracking Events--");
				}
				System.out.println("--Track Details--");
				System.out.println();
			}
		}
	}

	private static void printCustomerExceptionRequests(CustomerExceptionRequestDetail[] exceptions){
		if(exceptions!=null){
			for(int i=0; i<exceptions.length; i++){
				CustomerExceptionRequestDetail exception=exceptions[i];
				print("Exception Id", exception.getId());
				print("Excpetion Status Code", exception.getStatusCode());
				print("Excpetion Status Description", exception.getStatusDescription());
				if(exception.getCreateTime()!=null){
					System.out.println("  Customer Exception Date--");
					print(exception.getCreateTime());
					System.out.println("  Customer Exception Date--");
				}
			}
		}
	}
	private static void printTrackEvents(TrackEvent[] events){
		if(events!=null){
			for(int i=0; i<events.length;i++){
				TrackEvent event=events[i];
				print("Event no. ", i);
				print(event.getTimestamp());
				if(event.getEventType()!=null){
					print("Type", event.getEventType());
				}
				print("Station Id", event.getStationId());
				print("Exception Code", event.getStatusExceptionCode());
				print("", event.getStatusExceptionDescription());
				print("Description", event.getEventDescription());
				if(event.getAddress()!=null){
					System.out.println("  Event Address--");
					print(event.getAddress());
					System.out.println("  Event Address--");
				}
				System.out.println();
			}
		}
	}
	private static void printStatusDetail(TrackStatusDetail tsd){
		if(tsd!=null){
			print(tsd.getCreationTime());
			print("Code", tsd.getCode());
			if(tsd.getLocation()!=null){
				System.out.println("--Location Address Detail--");
				print(tsd.getLocation());
				System.out.println("--Location Address Detail--");
			}
			if(tsd.getAncillaryDetails()!=null){
				System.out.println("--Ancillary Details--");
				printAncillaryDetails(tsd.getAncillaryDetails());
				System.out.println("--Ancillary Details--");
			}
		}
	}
	private static void printAncillaryDetails(TrackStatusAncillaryDetail[] details){
		if(details!=null){
			for(int i=0; i<details.length;i++){
				if(details[i]!=null){
					if(details[i].getReason()!=null && details[i].getReasonDescription()!=null){
						print(details[i].getReason(), details[i].getReasonDescription());
					}
				}
			}
		}
	}
	private static void printDestinationInformation(TrackDetail td){
		if(td.getDestinationAddress()!=null){
			print(td.getDestinationAddress());
		}
		print("Destination Type", td.getDestinationLocationType());
		print("Service Area", td.getDestinationServiceArea());
		print("Service Area Description", td.getDestinationServiceAreaDescription());
		print("Station Id", td.getDestinationStationId());
		print("Destination Timezone Offset", td.getDestinationLocationTimeZoneOffset());
	}
	private static void printDeliveryOptionEligibility(DeliveryOptionEligibilityDetail[] options){
		for(int i=0; i<options.length; i++){
			DeliveryOptionEligibilityDetail option = options[i];
			if(option!=null){
				print(option.getOption(), option.getEligibility());
			}
		}
	}
	private static void printDeliveryInformation(TrackDetail td){
		System.out.println("Delivery attempts: " + td.getDeliveryAttempts());
		print("Delivery Location", td.getDeliveryLocationDescription());
		print("Delivery Signature", td.getDeliverySignatureName());
		if(td.getDeliveryOptionEligibilityDetails()!=null){
			System.out.println("Delivery Options");
			printDeliveryOptionEligibility(td.getDeliveryOptionEligibilityDetails());
		}
	}
	private static void printTrackOtherIdentifierDetail(TrackOtherIdentifierDetail[] id){
		if(id!=null){
			for(int i=0; i<id.length; i++){
				if(id[i].getPackageIdentifier()!=null){
					print(id[i].getPackageIdentifier().getType(), 
							id[i].getPackageIdentifier().getValue());
				}
			}
		}
	}

	private static void printTime(Calendar calendar){
		if(calendar!=null){
			int month = calendar.get(Calendar.MONTH)+1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int year = calendar.get(Calendar.YEAR);
			String date = new String(year + "-" + month + "-" + day);
			print("Date", date);
			printDOW(calendar);
		}
	}
	private static void printAddress(Address address){
		print("__________________________________");
		if(address.getStreetLines()!=null){
			String[] streetLines=address.getStreetLines();
			for(int i=0;i<streetLines.length;i++){
				if(streetLines[i]!=null){
					print("Street", streetLines[i]);
							
				}
			}
		}		
		print("City", address.getCity());
		print("State or Province Code", address.getStateOrProvinceCode());
		print("Postal Code", address.getPostalCode());
		print("Country Code", address.getCountryCode());
		if(address.getResidential()!=null){
			if(address.getResidential()){
				print("Address Type","Residential");
			}else{
				print("Address Type", "Commercial");
			}
		}
		print("__________________________________");
	}
	private static void printDOW(Calendar calendar){
		if(calendar!=null){
			String day;
			switch(calendar.get(Calendar.DAY_OF_WEEK)){
				case 1: day="Sunday";
				break;
				case 2: day="Monday";
				break;
				case 3: day="Tuesday";
				break;
				case 4: day="Wedensday";
				break;
				case 5: day="Thursday";
				break;
				case 6: day="Friday";
				break;
				case 7: day="Saturday";
				break;
				default: day="Invalid Date";
				break;
			}
			print("Day of Week", day);			
		}
	}

	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}

	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("fedex.client.accountNumber.us");
        String meterNumber = System.getProperty("fedex.client.meterNumber.us");
        
        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
        	accountNumber = config.getProperty("fedex.client.accountNumber.us"); // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = config.getProperty("fedex.client.meterNumber.us"); // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}

	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential wac = new WebAuthenticationCredential();
        String key = System.getProperty("fedex.web.key.us");
        String password = System.getProperty("fedex.web.passwd.us");
        
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
        	key = config.getProperty("fedex.web.key.us"); // Replace "XXX" with clients key
        }
        if (password == null) {
        	password = config.getProperty("fedex.web.passwd.us"); // Replace "XXX" with clients password
        }
        wac.setKey(key);
        wac.setPassword(password);
		return new WebAuthenticationDetail(wac);
	}
	
	private static void printCharges(TrackChargeDetail[] charges){
		if(charges!=null){
			for(int i=0; i<charges.length; i++){
				print("Charge Type", charges[i].getType());
				printMoney(charges[i].getChargeAmount());
			}
		}
	}
	private static void printMoney(Money money){
		if(money!=null){
			String currency = money.getCurrency();
			String amount = money.getAmount().toString();
			print("Charge", currency + " " + amount);
		}
	}
	
	public static boolean printNotifications(Object n) {
		boolean cont=true;
		if(n!=null){
			Notification[] notifications=null;
			Notification notification=null;
			if(n instanceof Notification[]){
				notifications=(Notification[])n;
				if (notifications == null || notifications.length == 0) {
					System.out.println("  No notifications returned");
				}
				for (int i=0; i < notifications.length; i++){
					printNotification(notifications[i]);
					if(!success(notifications[i])){cont=false;}
				}
			}else if(n instanceof Notification){
				notification=(Notification)n;
				printNotification(notification);
				if(!success(notification)){cont=false;}
			}

		}
		return cont;
	}
	private static void printNotification(Notification notification){
		if (notification == null) {
			System.out.println("null");
		}
		NotificationSeverityType nst = notification.getSeverity();

		print("  Severity", (nst == null ? "null" : nst.getValue()));
		print("  Code", notification.getCode());
		print("  Message", notification.getMessage());
		print("  Source", notification.getSource());
	}
	
	private static boolean success(Notification notification){
		Boolean cont = true;
		if(notification!=null){
			if(notification.getSeverity()==NotificationSeverityType.FAILURE || 
					notification.getSeverity()==NotificationSeverityType.ERROR){
				cont=false;
			}
		}
		
		return cont;
	}

	private static void updateEndPoint(TrackServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setTrackServicePortEndpointAddress(endPoint);
		}
	}

	private static void print(Object k, Object v) {
		if (k == null || v == null) {
			return;
		}
		String key;
		String value;
		if(k instanceof String){
			key=(String)k;
		}else{
			key=k.toString();
		}
		if(v instanceof String){
			value=(String)v;
		}else{
			value=v.toString();
		}
		System.out.println("  " + key + ": " + value);
	}
	
	private static void print(Object o){
		if(o!=null){
			if(o instanceof String){
				System.out.println((String)o);
			}else if(o instanceof Address){
				printAddress((Address)o);
			}else if(o instanceof Calendar){
				printTime((Calendar)o);
			}else{
				System.out.println(o.toString());
			}
			
		}
	}
	
	private static void printWeight(String msg, Weight weight) {
		if (msg == null || weight == null) {
			return;
		}
		System.out.println(msg + ": " + weight.getValue() + " " + weight.getUnits());
	}

	private static String getSystemProperty(String property){
		String returnProperty = System.getProperty(property);
		if (returnProperty == null){
			return "XXX";
		}
		return returnProperty;
	}

}
