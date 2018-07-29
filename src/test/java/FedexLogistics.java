import com.fedex.track.stub.Address;
import com.fedex.track.stub.TrackEvent;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FedexLogistics {
    private String trackNum;
    private String service;
    private String weight;
    private String dimensions;
    private String deliveryAttempts;
    private String deliveredTo;
    private String totalPiece;
    private String totalShipmentWeight;
    private String terms;
    private String shipperReference;
    private String packaging;
    private String specialHandlingSection;
    private Date standardTransit;
    private Date shipDate;
    private Date actualDate;
    private Address shipperAddress;
    private Address destinationAddress;
    private Address lastUpdateDestinationAddress;
    private Address actualDeliveryAddress;

    private List<TrackEvent> events;
}
