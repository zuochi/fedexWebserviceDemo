import com.fedex.soapsamples.util.TrackWebServiceClient;
import com.fedex.track.stub.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FedexUtils {

    private FedexUtils(){};

    /**
     * 根据物流单号获取物流信息, 返回一个列表
     * @param trackNum 物流单号
     * @param customerId 自定义ID，将会包含在返回结果里面
     */
    public static List<FedexLogistics> getLogisticsInfo(String trackNum, String customerId){
        if(trackNum == null || "".equals(trackNum.trim())){
            throw new RuntimeException("please input the right trackNum.");
        }

        if(customerId == null || "".equals(customerId.trim())){
            customerId = UUID.randomUUID().toString();
        }

        List<FedexLogistics> result = new ArrayList<FedexLogistics>();

        try {

            TrackReply reply = TrackWebServiceClient.getTrackReply(trackNum, customerId); // This is the call to the web service passing in a request object and returning a reply object

            CompletedTrackDetail[] trackDetails = reply.getCompletedTrackDetails();
            for(CompletedTrackDetail cpDetail : trackDetails){

                for(TrackDetail detail : cpDetail.getTrackDetails()){
                    FedexLogistics logistics = new FedexLogistics();
                    logistics.setTrackNum(detail.getTrackingNumber());
                    logistics.setService(detail.getService().getDescription());
                    logistics.setWeight(detail.getPackageWeight().getValue() + " " + detail.getPackageWeight().getUnits() + "s");
                    logistics.setDimensions(detail.getPackageDimensions().getLength() + "x" + detail.getPackageDimensions().getWidth() + "x" + detail.getPackageDimensions().getHeight() + " " + detail.getPackageDimensions().getUnits());
                    logistics.setDeliveryAttempts(String.valueOf(detail.getDeliveryAttempts().signum()));
                    logistics.setDeliveredTo(detail.getDeliveryLocationDescription());
                    logistics.setTotalPiece(String.valueOf(detail.getPackageCount().signum()));
                    logistics.setTotalShipmentWeight(detail.getShipmentWeight().getValue() + " " + detail.getShipmentWeight().getUnits() + "s");
                    logistics.setPackaging(detail.getPackaging());

                    String specialHandlings = "";
                    for(int i=0 ; i<detail.getSpecialHandlings().length ; i++){
                        specialHandlings += (detail.getSpecialHandlings()[i].getDescription() + ",");
                    }
                    logistics.setSpecialHandlingSection(specialHandlings.substring(0, specialHandlings.length()-1));
                    logistics.setShipDate(detail.getShipTimestamp().getTime());
                    logistics.setActualDate(detail.getActualDeliveryTimestamp().getTime());

                    // address info
                    logistics.setShipperAddress(detail.getShipperAddress());
                    logistics.setDestinationAddress(detail.getDestinationAddress());
                    logistics.setLastUpdateDestinationAddress(detail.getLastUpdatedDestinationAddress());
                    logistics.setActualDeliveryAddress(detail.getActualDeliveryAddress());
                    logistics.setEvents(Arrays.asList(detail.getEvents()));

                    result.add(logistics);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // DEMO CODE TODO
    public static void main(String[] args) {
        List<FedexLogistics> result = FedexUtils.getLogisticsInfo("772063796947", null);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(result != null && result.size() > 0){
            for(FedexLogistics logistices : result){
                for(TrackEvent event : logistices.getEvents()){
                    System.out.println("日期:" + df.format(event.getTimestamp().getTime())
                            + ", 物流代号:" + event.getEventType()
                            + ", 物流信息:" + event.getEventDescription()
                            + ", 地址信息:" + event.getAddress().getCity() + " " + event.getAddress().getCountryName() + " " + event.getAddress().getPostalCode());
                }
            }
        }
    }
}
