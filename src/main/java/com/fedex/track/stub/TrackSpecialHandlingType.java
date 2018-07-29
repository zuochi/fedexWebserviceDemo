/**
 * TrackSpecialHandlingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackSpecialHandlingType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackSpecialHandlingType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ACCESSIBLE_DANGEROUS_GOODS = "ACCESSIBLE_DANGEROUS_GOODS";
    public static final String _ADULT_SIGNATURE_OPTION = "ADULT_SIGNATURE_OPTION";
    public static final String _AIRBILL_AUTOMATION = "AIRBILL_AUTOMATION";
    public static final String _AIRBILL_DELIVERY = "AIRBILL_DELIVERY";
    public static final String _ALCOHOL = "ALCOHOL";
    public static final String _AM_DELIVERY_GUARANTEE = "AM_DELIVERY_GUARANTEE";
    public static final String _APPOINTMENT_DELIVERY = "APPOINTMENT_DELIVERY";
    public static final String _BILL_RECIPIENT = "BILL_RECIPIENT";
    public static final String _BROKER_SELECT_OPTION = "BROKER_SELECT_OPTION";
    public static final String _CALL_BEFORE_DELIVERY = "CALL_BEFORE_DELIVERY";
    public static final String _CALL_TAG = "CALL_TAG";
    public static final String _CALL_TAG_DAMAGE = "CALL_TAG_DAMAGE";
    public static final String _CHARGEABLE_CODE = "CHARGEABLE_CODE";
    public static final String _COD = "COD";
    public static final String _COLLECT = "COLLECT";
    public static final String _CONSOLIDATION = "CONSOLIDATION";
    public static final String _CONSOLIDATION_SMALLS_BAG = "CONSOLIDATION_SMALLS_BAG";
    public static final String _CURRENCY = "CURRENCY";
    public static final String _CUT_FLOWERS = "CUT_FLOWERS";
    public static final String _DATE_CERTAIN_DELIVERY = "DATE_CERTAIN_DELIVERY";
    public static final String _DELIVERY_ON_INVOICE_ACCEPTANCE = "DELIVERY_ON_INVOICE_ACCEPTANCE";
    public static final String _DELIVERY_REATTEMPT = "DELIVERY_REATTEMPT";
    public static final String _DELIVERY_RECEIPT = "DELIVERY_RECEIPT";
    public static final String _DELIVER_WEEKDAY = "DELIVER_WEEKDAY";
    public static final String _DIRECT_SIGNATURE_OPTION = "DIRECT_SIGNATURE_OPTION";
    public static final String _DOMESTIC = "DOMESTIC";
    public static final String _DO_NOT_BREAK_DOWN_PALLETS = "DO_NOT_BREAK_DOWN_PALLETS";
    public static final String _DO_NOT_STACK_PALLETS = "DO_NOT_STACK_PALLETS";
    public static final String _DRY_ICE = "DRY_ICE";
    public static final String _DRY_ICE_ADDED = "DRY_ICE_ADDED";
    public static final String _EAST_COAST_SPECIAL = "EAST_COAST_SPECIAL";
    public static final String _ELECTRONIC_COD = "ELECTRONIC_COD";
    public static final String _ELECTRONIC_SIGNATURE_SERVICE = "ELECTRONIC_SIGNATURE_SERVICE";
    public static final String _EVENING_DELIVERY = "EVENING_DELIVERY";
    public static final String _EXCLUSIVE_USE = "EXCLUSIVE_USE";
    public static final String _EXTENDED_DELIVERY = "EXTENDED_DELIVERY";
    public static final String _EXTENDED_PICKUP = "EXTENDED_PICKUP";
    public static final String _EXTRA_LABOR = "EXTRA_LABOR";
    public static final String _EXTREME_LENGTH = "EXTREME_LENGTH";
    public static final String _FOOD = "FOOD";
    public static final String _FREIGHT_ON_VALUE_CARRIER_RISK = "FREIGHT_ON_VALUE_CARRIER_RISK";
    public static final String _FREIGHT_ON_VALUE_OWN_RISK = "FREIGHT_ON_VALUE_OWN_RISK";
    public static final String _FREIGHT_TO_COLLECT = "FREIGHT_TO_COLLECT";
    public static final String _FULLY_REGULATED_DANGEROUS_GOODS = "FULLY_REGULATED_DANGEROUS_GOODS";
    public static final String _GEL_PACKS_ADDED_OR_REPLACED = "GEL_PACKS_ADDED_OR_REPLACED";
    public static final String _GROUND_SUPPORT_FOR_SMARTPOST = "GROUND_SUPPORT_FOR_SMARTPOST";
    public static final String _GUARANTEED_FUNDS = "GUARANTEED_FUNDS";
    public static final String _HAZMAT = "HAZMAT";
    public static final String _HIGH_FLOOR = "HIGH_FLOOR";
    public static final String _HOLD_AT_LOCATION = "HOLD_AT_LOCATION";
    public static final String _HOLIDAY_DELIVERY = "HOLIDAY_DELIVERY";
    public static final String _INACCESSIBLE_DANGEROUS_GOODS = "INACCESSIBLE_DANGEROUS_GOODS";
    public static final String _INDIRECT_SIGNATURE_OPTION = "INDIRECT_SIGNATURE_OPTION";
    public static final String _INSIDE_DELIVERY = "INSIDE_DELIVERY";
    public static final String _INSIDE_PICKUP = "INSIDE_PICKUP";
    public static final String _INTERNATIONAL = "INTERNATIONAL";
    public static final String _INTERNATIONAL_CONTROLLED_EXPORT = "INTERNATIONAL_CONTROLLED_EXPORT";
    public static final String _INTERNATIONAL_MAIL_SERVICE = "INTERNATIONAL_MAIL_SERVICE";
    public static final String _INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS = "INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS";
    public static final String _LIFTGATE = "LIFTGATE";
    public static final String _LIFTGATE_DELIVERY = "LIFTGATE_DELIVERY";
    public static final String _LIFTGATE_PICKUP = "LIFTGATE_PICKUP";
    public static final String _LIMITED_ACCESS_DELIVERY = "LIMITED_ACCESS_DELIVERY";
    public static final String _LIMITED_ACCESS_PICKUP = "LIMITED_ACCESS_PICKUP";
    public static final String _LIMITED_QUANTITIES_DANGEROUS_GOODS = "LIMITED_QUANTITIES_DANGEROUS_GOODS";
    public static final String _MARKING_OR_TAGGING = "MARKING_OR_TAGGING";
    public static final String _NET_RETURN = "NET_RETURN";
    public static final String _NON_BUSINESS_TIME = "NON_BUSINESS_TIME";
    public static final String _NON_STANDARD_CONTAINER = "NON_STANDARD_CONTAINER";
    public static final String _ORDER_NOTIFY = "ORDER_NOTIFY";
    public static final String _OTHER = "OTHER";
    public static final String _OTHER_REGULATED_MATERIAL_DOMESTIC = "OTHER_REGULATED_MATERIAL_DOMESTIC";
    public static final String _PACKAGE_RETURN_PROGRAM = "PACKAGE_RETURN_PROGRAM";
    public static final String _PIECE_COUNT_VERIFICATION = "PIECE_COUNT_VERIFICATION";
    public static final String _POISON = "POISON";
    public static final String _PREPAID = "PREPAID";
    public static final String _PRIORITY_ALERT = "PRIORITY_ALERT";
    public static final String _PRIORITY_ALERT_PLUS = "PRIORITY_ALERT_PLUS";
    public static final String _PROTECTION_FROM_FREEZING = "PROTECTION_FROM_FREEZING";
    public static final String _RAIL_MODE = "RAIL_MODE";
    public static final String _RECONSIGNMENT_CHARGES = "RECONSIGNMENT_CHARGES";
    public static final String _REROUTE_CROSS_COUNTRY_DEFERRED = "REROUTE_CROSS_COUNTRY_DEFERRED";
    public static final String _REROUTE_CROSS_COUNTRY_EXPEDITED = "REROUTE_CROSS_COUNTRY_EXPEDITED";
    public static final String _REROUTE_LOCAL = "REROUTE_LOCAL";
    public static final String _RESIDENTIAL_DELIVERY = "RESIDENTIAL_DELIVERY";
    public static final String _RESIDENTIAL_PICKUP = "RESIDENTIAL_PICKUP";
    public static final String _RETURNS_CLEARANCE = "RETURNS_CLEARANCE";
    public static final String _RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED = "RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED";
    public static final String _RETURN_MANAGER = "RETURN_MANAGER";
    public static final String _SATURDAY_DELIVERY = "SATURDAY_DELIVERY";
    public static final String _SHIPMENT_PLACED_IN_COLD_STORAGE = "SHIPMENT_PLACED_IN_COLD_STORAGE";
    public static final String _SINGLE_SHIPMENT = "SINGLE_SHIPMENT";
    public static final String _SMALL_QUANTITY_EXCEPTION = "SMALL_QUANTITY_EXCEPTION";
    public static final String _SORT_AND_SEGREGATE = "SORT_AND_SEGREGATE";
    public static final String _SPECIAL_DELIVERY = "SPECIAL_DELIVERY";
    public static final String _SPECIAL_EQUIPMENT = "SPECIAL_EQUIPMENT";
    public static final String _STANDARD_GROUND_SERVICE = "STANDARD_GROUND_SERVICE";
    public static final String _STORAGE = "STORAGE";
    public static final String _SUNDAY_DELIVERY = "SUNDAY_DELIVERY";
    public static final String _THIRD_PARTY_BILLING = "THIRD_PARTY_BILLING";
    public static final String _THIRD_PARTY_CONSIGNEE = "THIRD_PARTY_CONSIGNEE";
    public static final String _TOP_LOAD = "TOP_LOAD";
    public static final String _WEEKEND_DELIVERY = "WEEKEND_DELIVERY";
    public static final String _WEEKEND_PICKUP = "WEEKEND_PICKUP";
    public static final TrackSpecialHandlingType ACCESSIBLE_DANGEROUS_GOODS = new TrackSpecialHandlingType(_ACCESSIBLE_DANGEROUS_GOODS);
    public static final TrackSpecialHandlingType ADULT_SIGNATURE_OPTION = new TrackSpecialHandlingType(_ADULT_SIGNATURE_OPTION);
    public static final TrackSpecialHandlingType AIRBILL_AUTOMATION = new TrackSpecialHandlingType(_AIRBILL_AUTOMATION);
    public static final TrackSpecialHandlingType AIRBILL_DELIVERY = new TrackSpecialHandlingType(_AIRBILL_DELIVERY);
    public static final TrackSpecialHandlingType ALCOHOL = new TrackSpecialHandlingType(_ALCOHOL);
    public static final TrackSpecialHandlingType AM_DELIVERY_GUARANTEE = new TrackSpecialHandlingType(_AM_DELIVERY_GUARANTEE);
    public static final TrackSpecialHandlingType APPOINTMENT_DELIVERY = new TrackSpecialHandlingType(_APPOINTMENT_DELIVERY);
    public static final TrackSpecialHandlingType BILL_RECIPIENT = new TrackSpecialHandlingType(_BILL_RECIPIENT);
    public static final TrackSpecialHandlingType BROKER_SELECT_OPTION = new TrackSpecialHandlingType(_BROKER_SELECT_OPTION);
    public static final TrackSpecialHandlingType CALL_BEFORE_DELIVERY = new TrackSpecialHandlingType(_CALL_BEFORE_DELIVERY);
    public static final TrackSpecialHandlingType CALL_TAG = new TrackSpecialHandlingType(_CALL_TAG);
    public static final TrackSpecialHandlingType CALL_TAG_DAMAGE = new TrackSpecialHandlingType(_CALL_TAG_DAMAGE);
    public static final TrackSpecialHandlingType CHARGEABLE_CODE = new TrackSpecialHandlingType(_CHARGEABLE_CODE);
    public static final TrackSpecialHandlingType COD = new TrackSpecialHandlingType(_COD);
    public static final TrackSpecialHandlingType COLLECT = new TrackSpecialHandlingType(_COLLECT);
    public static final TrackSpecialHandlingType CONSOLIDATION = new TrackSpecialHandlingType(_CONSOLIDATION);
    public static final TrackSpecialHandlingType CONSOLIDATION_SMALLS_BAG = new TrackSpecialHandlingType(_CONSOLIDATION_SMALLS_BAG);
    public static final TrackSpecialHandlingType CURRENCY = new TrackSpecialHandlingType(_CURRENCY);
    public static final TrackSpecialHandlingType CUT_FLOWERS = new TrackSpecialHandlingType(_CUT_FLOWERS);
    public static final TrackSpecialHandlingType DATE_CERTAIN_DELIVERY = new TrackSpecialHandlingType(_DATE_CERTAIN_DELIVERY);
    public static final TrackSpecialHandlingType DELIVERY_ON_INVOICE_ACCEPTANCE = new TrackSpecialHandlingType(_DELIVERY_ON_INVOICE_ACCEPTANCE);
    public static final TrackSpecialHandlingType DELIVERY_REATTEMPT = new TrackSpecialHandlingType(_DELIVERY_REATTEMPT);
    public static final TrackSpecialHandlingType DELIVERY_RECEIPT = new TrackSpecialHandlingType(_DELIVERY_RECEIPT);
    public static final TrackSpecialHandlingType DELIVER_WEEKDAY = new TrackSpecialHandlingType(_DELIVER_WEEKDAY);
    public static final TrackSpecialHandlingType DIRECT_SIGNATURE_OPTION = new TrackSpecialHandlingType(_DIRECT_SIGNATURE_OPTION);
    public static final TrackSpecialHandlingType DOMESTIC = new TrackSpecialHandlingType(_DOMESTIC);
    public static final TrackSpecialHandlingType DO_NOT_BREAK_DOWN_PALLETS = new TrackSpecialHandlingType(_DO_NOT_BREAK_DOWN_PALLETS);
    public static final TrackSpecialHandlingType DO_NOT_STACK_PALLETS = new TrackSpecialHandlingType(_DO_NOT_STACK_PALLETS);
    public static final TrackSpecialHandlingType DRY_ICE = new TrackSpecialHandlingType(_DRY_ICE);
    public static final TrackSpecialHandlingType DRY_ICE_ADDED = new TrackSpecialHandlingType(_DRY_ICE_ADDED);
    public static final TrackSpecialHandlingType EAST_COAST_SPECIAL = new TrackSpecialHandlingType(_EAST_COAST_SPECIAL);
    public static final TrackSpecialHandlingType ELECTRONIC_COD = new TrackSpecialHandlingType(_ELECTRONIC_COD);
    public static final TrackSpecialHandlingType ELECTRONIC_SIGNATURE_SERVICE = new TrackSpecialHandlingType(_ELECTRONIC_SIGNATURE_SERVICE);
    public static final TrackSpecialHandlingType EVENING_DELIVERY = new TrackSpecialHandlingType(_EVENING_DELIVERY);
    public static final TrackSpecialHandlingType EXCLUSIVE_USE = new TrackSpecialHandlingType(_EXCLUSIVE_USE);
    public static final TrackSpecialHandlingType EXTENDED_DELIVERY = new TrackSpecialHandlingType(_EXTENDED_DELIVERY);
    public static final TrackSpecialHandlingType EXTENDED_PICKUP = new TrackSpecialHandlingType(_EXTENDED_PICKUP);
    public static final TrackSpecialHandlingType EXTRA_LABOR = new TrackSpecialHandlingType(_EXTRA_LABOR);
    public static final TrackSpecialHandlingType EXTREME_LENGTH = new TrackSpecialHandlingType(_EXTREME_LENGTH);
    public static final TrackSpecialHandlingType FOOD = new TrackSpecialHandlingType(_FOOD);
    public static final TrackSpecialHandlingType FREIGHT_ON_VALUE_CARRIER_RISK = new TrackSpecialHandlingType(_FREIGHT_ON_VALUE_CARRIER_RISK);
    public static final TrackSpecialHandlingType FREIGHT_ON_VALUE_OWN_RISK = new TrackSpecialHandlingType(_FREIGHT_ON_VALUE_OWN_RISK);
    public static final TrackSpecialHandlingType FREIGHT_TO_COLLECT = new TrackSpecialHandlingType(_FREIGHT_TO_COLLECT);
    public static final TrackSpecialHandlingType FULLY_REGULATED_DANGEROUS_GOODS = new TrackSpecialHandlingType(_FULLY_REGULATED_DANGEROUS_GOODS);
    public static final TrackSpecialHandlingType GEL_PACKS_ADDED_OR_REPLACED = new TrackSpecialHandlingType(_GEL_PACKS_ADDED_OR_REPLACED);
    public static final TrackSpecialHandlingType GROUND_SUPPORT_FOR_SMARTPOST = new TrackSpecialHandlingType(_GROUND_SUPPORT_FOR_SMARTPOST);
    public static final TrackSpecialHandlingType GUARANTEED_FUNDS = new TrackSpecialHandlingType(_GUARANTEED_FUNDS);
    public static final TrackSpecialHandlingType HAZMAT = new TrackSpecialHandlingType(_HAZMAT);
    public static final TrackSpecialHandlingType HIGH_FLOOR = new TrackSpecialHandlingType(_HIGH_FLOOR);
    public static final TrackSpecialHandlingType HOLD_AT_LOCATION = new TrackSpecialHandlingType(_HOLD_AT_LOCATION);
    public static final TrackSpecialHandlingType HOLIDAY_DELIVERY = new TrackSpecialHandlingType(_HOLIDAY_DELIVERY);
    public static final TrackSpecialHandlingType INACCESSIBLE_DANGEROUS_GOODS = new TrackSpecialHandlingType(_INACCESSIBLE_DANGEROUS_GOODS);
    public static final TrackSpecialHandlingType INDIRECT_SIGNATURE_OPTION = new TrackSpecialHandlingType(_INDIRECT_SIGNATURE_OPTION);
    public static final TrackSpecialHandlingType INSIDE_DELIVERY = new TrackSpecialHandlingType(_INSIDE_DELIVERY);
    public static final TrackSpecialHandlingType INSIDE_PICKUP = new TrackSpecialHandlingType(_INSIDE_PICKUP);
    public static final TrackSpecialHandlingType INTERNATIONAL = new TrackSpecialHandlingType(_INTERNATIONAL);
    public static final TrackSpecialHandlingType INTERNATIONAL_CONTROLLED_EXPORT = new TrackSpecialHandlingType(_INTERNATIONAL_CONTROLLED_EXPORT);
    public static final TrackSpecialHandlingType INTERNATIONAL_MAIL_SERVICE = new TrackSpecialHandlingType(_INTERNATIONAL_MAIL_SERVICE);
    public static final TrackSpecialHandlingType INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS = new TrackSpecialHandlingType(_INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS);
    public static final TrackSpecialHandlingType LIFTGATE = new TrackSpecialHandlingType(_LIFTGATE);
    public static final TrackSpecialHandlingType LIFTGATE_DELIVERY = new TrackSpecialHandlingType(_LIFTGATE_DELIVERY);
    public static final TrackSpecialHandlingType LIFTGATE_PICKUP = new TrackSpecialHandlingType(_LIFTGATE_PICKUP);
    public static final TrackSpecialHandlingType LIMITED_ACCESS_DELIVERY = new TrackSpecialHandlingType(_LIMITED_ACCESS_DELIVERY);
    public static final TrackSpecialHandlingType LIMITED_ACCESS_PICKUP = new TrackSpecialHandlingType(_LIMITED_ACCESS_PICKUP);
    public static final TrackSpecialHandlingType LIMITED_QUANTITIES_DANGEROUS_GOODS = new TrackSpecialHandlingType(_LIMITED_QUANTITIES_DANGEROUS_GOODS);
    public static final TrackSpecialHandlingType MARKING_OR_TAGGING = new TrackSpecialHandlingType(_MARKING_OR_TAGGING);
    public static final TrackSpecialHandlingType NET_RETURN = new TrackSpecialHandlingType(_NET_RETURN);
    public static final TrackSpecialHandlingType NON_BUSINESS_TIME = new TrackSpecialHandlingType(_NON_BUSINESS_TIME);
    public static final TrackSpecialHandlingType NON_STANDARD_CONTAINER = new TrackSpecialHandlingType(_NON_STANDARD_CONTAINER);
    public static final TrackSpecialHandlingType ORDER_NOTIFY = new TrackSpecialHandlingType(_ORDER_NOTIFY);
    public static final TrackSpecialHandlingType OTHER = new TrackSpecialHandlingType(_OTHER);
    public static final TrackSpecialHandlingType OTHER_REGULATED_MATERIAL_DOMESTIC = new TrackSpecialHandlingType(_OTHER_REGULATED_MATERIAL_DOMESTIC);
    public static final TrackSpecialHandlingType PACKAGE_RETURN_PROGRAM = new TrackSpecialHandlingType(_PACKAGE_RETURN_PROGRAM);
    public static final TrackSpecialHandlingType PIECE_COUNT_VERIFICATION = new TrackSpecialHandlingType(_PIECE_COUNT_VERIFICATION);
    public static final TrackSpecialHandlingType POISON = new TrackSpecialHandlingType(_POISON);
    public static final TrackSpecialHandlingType PREPAID = new TrackSpecialHandlingType(_PREPAID);
    public static final TrackSpecialHandlingType PRIORITY_ALERT = new TrackSpecialHandlingType(_PRIORITY_ALERT);
    public static final TrackSpecialHandlingType PRIORITY_ALERT_PLUS = new TrackSpecialHandlingType(_PRIORITY_ALERT_PLUS);
    public static final TrackSpecialHandlingType PROTECTION_FROM_FREEZING = new TrackSpecialHandlingType(_PROTECTION_FROM_FREEZING);
    public static final TrackSpecialHandlingType RAIL_MODE = new TrackSpecialHandlingType(_RAIL_MODE);
    public static final TrackSpecialHandlingType RECONSIGNMENT_CHARGES = new TrackSpecialHandlingType(_RECONSIGNMENT_CHARGES);
    public static final TrackSpecialHandlingType REROUTE_CROSS_COUNTRY_DEFERRED = new TrackSpecialHandlingType(_REROUTE_CROSS_COUNTRY_DEFERRED);
    public static final TrackSpecialHandlingType REROUTE_CROSS_COUNTRY_EXPEDITED = new TrackSpecialHandlingType(_REROUTE_CROSS_COUNTRY_EXPEDITED);
    public static final TrackSpecialHandlingType REROUTE_LOCAL = new TrackSpecialHandlingType(_REROUTE_LOCAL);
    public static final TrackSpecialHandlingType RESIDENTIAL_DELIVERY = new TrackSpecialHandlingType(_RESIDENTIAL_DELIVERY);
    public static final TrackSpecialHandlingType RESIDENTIAL_PICKUP = new TrackSpecialHandlingType(_RESIDENTIAL_PICKUP);
    public static final TrackSpecialHandlingType RETURNS_CLEARANCE = new TrackSpecialHandlingType(_RETURNS_CLEARANCE);
    public static final TrackSpecialHandlingType RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED = new TrackSpecialHandlingType(_RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED);
    public static final TrackSpecialHandlingType RETURN_MANAGER = new TrackSpecialHandlingType(_RETURN_MANAGER);
    public static final TrackSpecialHandlingType SATURDAY_DELIVERY = new TrackSpecialHandlingType(_SATURDAY_DELIVERY);
    public static final TrackSpecialHandlingType SHIPMENT_PLACED_IN_COLD_STORAGE = new TrackSpecialHandlingType(_SHIPMENT_PLACED_IN_COLD_STORAGE);
    public static final TrackSpecialHandlingType SINGLE_SHIPMENT = new TrackSpecialHandlingType(_SINGLE_SHIPMENT);
    public static final TrackSpecialHandlingType SMALL_QUANTITY_EXCEPTION = new TrackSpecialHandlingType(_SMALL_QUANTITY_EXCEPTION);
    public static final TrackSpecialHandlingType SORT_AND_SEGREGATE = new TrackSpecialHandlingType(_SORT_AND_SEGREGATE);
    public static final TrackSpecialHandlingType SPECIAL_DELIVERY = new TrackSpecialHandlingType(_SPECIAL_DELIVERY);
    public static final TrackSpecialHandlingType SPECIAL_EQUIPMENT = new TrackSpecialHandlingType(_SPECIAL_EQUIPMENT);
    public static final TrackSpecialHandlingType STANDARD_GROUND_SERVICE = new TrackSpecialHandlingType(_STANDARD_GROUND_SERVICE);
    public static final TrackSpecialHandlingType STORAGE = new TrackSpecialHandlingType(_STORAGE);
    public static final TrackSpecialHandlingType SUNDAY_DELIVERY = new TrackSpecialHandlingType(_SUNDAY_DELIVERY);
    public static final TrackSpecialHandlingType THIRD_PARTY_BILLING = new TrackSpecialHandlingType(_THIRD_PARTY_BILLING);
    public static final TrackSpecialHandlingType THIRD_PARTY_CONSIGNEE = new TrackSpecialHandlingType(_THIRD_PARTY_CONSIGNEE);
    public static final TrackSpecialHandlingType TOP_LOAD = new TrackSpecialHandlingType(_TOP_LOAD);
    public static final TrackSpecialHandlingType WEEKEND_DELIVERY = new TrackSpecialHandlingType(_WEEKEND_DELIVERY);
    public static final TrackSpecialHandlingType WEEKEND_PICKUP = new TrackSpecialHandlingType(_WEEKEND_PICKUP);
    public String getValue() { return _value_;}
    public static TrackSpecialHandlingType fromValue(String value)
          throws IllegalArgumentException {
        TrackSpecialHandlingType enumeration = (TrackSpecialHandlingType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackSpecialHandlingType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackSpecialHandlingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackSpecialHandlingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
