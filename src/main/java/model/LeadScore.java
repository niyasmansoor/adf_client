/**
 * LeadScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

public class LeadScore  implements java.io.Serializable {
    private double cityScore;

    private boolean contactFlagSet;

    private double contactTimeScore;

    private double contactTypeScore;

    private double emailScore;

    private double firstNameScore;

    private double lastNameScore;

    private double phoneNoScore;

    private double purchaseTypeScore;

    private double score;

    private double stateScore;

    private double timeFrameScore;

    private double zipCityStateScore;

    private double zipCodeScore;

    public LeadScore() {
    }

    public LeadScore(
           double cityScore,
           boolean contactFlagSet,
           double contactTimeScore,
           double contactTypeScore,
           double emailScore,
           double firstNameScore,
           double lastNameScore,
           double phoneNoScore,
           double purchaseTypeScore,
           double score,
           double stateScore,
           double timeFrameScore,
           double zipCityStateScore,
           double zipCodeScore) {
           this.cityScore = cityScore;
           this.contactFlagSet = contactFlagSet;
           this.contactTimeScore = contactTimeScore;
           this.contactTypeScore = contactTypeScore;
           this.emailScore = emailScore;
           this.firstNameScore = firstNameScore;
           this.lastNameScore = lastNameScore;
           this.phoneNoScore = phoneNoScore;
           this.purchaseTypeScore = purchaseTypeScore;
           this.score = score;
           this.stateScore = stateScore;
           this.timeFrameScore = timeFrameScore;
           this.zipCityStateScore = zipCityStateScore;
           this.zipCodeScore = zipCodeScore;
    }


    /**
     * Gets the cityScore value for this LeadScore.
     * 
     * @return cityScore
     */
    public double getCityScore() {
        return cityScore;
    }


    /**
     * Sets the cityScore value for this LeadScore.
     * 
     * @param cityScore
     */
    public void setCityScore(double cityScore) {
        this.cityScore = cityScore;
    }


    /**
     * Gets the contactFlagSet value for this LeadScore.
     * 
     * @return contactFlagSet
     */
    public boolean isContactFlagSet() {
        return contactFlagSet;
    }


    /**
     * Sets the contactFlagSet value for this LeadScore.
     * 
     * @param contactFlagSet
     */
    public void setContactFlagSet(boolean contactFlagSet) {
        this.contactFlagSet = contactFlagSet;
    }


    /**
     * Gets the contactTimeScore value for this LeadScore.
     * 
     * @return contactTimeScore
     */
    public double getContactTimeScore() {
        return contactTimeScore;
    }


    /**
     * Sets the contactTimeScore value for this LeadScore.
     * 
     * @param contactTimeScore
     */
    public void setContactTimeScore(double contactTimeScore) {
        this.contactTimeScore = contactTimeScore;
    }


    /**
     * Gets the contactTypeScore value for this LeadScore.
     * 
     * @return contactTypeScore
     */
    public double getContactTypeScore() {
        return contactTypeScore;
    }


    /**
     * Sets the contactTypeScore value for this LeadScore.
     * 
     * @param contactTypeScore
     */
    public void setContactTypeScore(double contactTypeScore) {
        this.contactTypeScore = contactTypeScore;
    }


    /**
     * Gets the emailScore value for this LeadScore.
     * 
     * @return emailScore
     */
    public double getEmailScore() {
        return emailScore;
    }


    /**
     * Sets the emailScore value for this LeadScore.
     * 
     * @param emailScore
     */
    public void setEmailScore(double emailScore) {
        this.emailScore = emailScore;
    }


    /**
     * Gets the firstNameScore value for this LeadScore.
     * 
     * @return firstNameScore
     */
    public double getFirstNameScore() {
        return firstNameScore;
    }


    /**
     * Sets the firstNameScore value for this LeadScore.
     * 
     * @param firstNameScore
     */
    public void setFirstNameScore(double firstNameScore) {
        this.firstNameScore = firstNameScore;
    }


    /**
     * Gets the lastNameScore value for this LeadScore.
     * 
     * @return lastNameScore
     */
    public double getLastNameScore() {
        return lastNameScore;
    }


    /**
     * Sets the lastNameScore value for this LeadScore.
     * 
     * @param lastNameScore
     */
    public void setLastNameScore(double lastNameScore) {
        this.lastNameScore = lastNameScore;
    }


    /**
     * Gets the phoneNoScore value for this LeadScore.
     * 
     * @return phoneNoScore
     */
    public double getPhoneNoScore() {
        return phoneNoScore;
    }


    /**
     * Sets the phoneNoScore value for this LeadScore.
     * 
     * @param phoneNoScore
     */
    public void setPhoneNoScore(double phoneNoScore) {
        this.phoneNoScore = phoneNoScore;
    }


    /**
     * Gets the purchaseTypeScore value for this LeadScore.
     * 
     * @return purchaseTypeScore
     */
    public double getPurchaseTypeScore() {
        return purchaseTypeScore;
    }


    /**
     * Sets the purchaseTypeScore value for this LeadScore.
     * 
     * @param purchaseTypeScore
     */
    public void setPurchaseTypeScore(double purchaseTypeScore) {
        this.purchaseTypeScore = purchaseTypeScore;
    }


    /**
     * Gets the score value for this LeadScore.
     * 
     * @return score
     */
    public double getScore() {
        return score;
    }


    /**
     * Sets the score value for this LeadScore.
     * 
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }


    /**
     * Gets the stateScore value for this LeadScore.
     * 
     * @return stateScore
     */
    public double getStateScore() {
        return stateScore;
    }


    /**
     * Sets the stateScore value for this LeadScore.
     * 
     * @param stateScore
     */
    public void setStateScore(double stateScore) {
        this.stateScore = stateScore;
    }


    /**
     * Gets the timeFrameScore value for this LeadScore.
     * 
     * @return timeFrameScore
     */
    public double getTimeFrameScore() {
        return timeFrameScore;
    }


    /**
     * Sets the timeFrameScore value for this LeadScore.
     * 
     * @param timeFrameScore
     */
    public void setTimeFrameScore(double timeFrameScore) {
        this.timeFrameScore = timeFrameScore;
    }


    /**
     * Gets the zipCityStateScore value for this LeadScore.
     * 
     * @return zipCityStateScore
     */
    public double getZipCityStateScore() {
        return zipCityStateScore;
    }


    /**
     * Sets the zipCityStateScore value for this LeadScore.
     * 
     * @param zipCityStateScore
     */
    public void setZipCityStateScore(double zipCityStateScore) {
        this.zipCityStateScore = zipCityStateScore;
    }


    /**
     * Gets the zipCodeScore value for this LeadScore.
     * 
     * @return zipCodeScore
     */
    public double getZipCodeScore() {
        return zipCodeScore;
    }


    /**
     * Sets the zipCodeScore value for this LeadScore.
     * 
     * @param zipCodeScore
     */
    public void setZipCodeScore(double zipCodeScore) {
        this.zipCodeScore = zipCodeScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LeadScore)) return false;
        LeadScore other = (LeadScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cityScore == other.getCityScore() &&
            this.contactFlagSet == other.isContactFlagSet() &&
            this.contactTimeScore == other.getContactTimeScore() &&
            this.contactTypeScore == other.getContactTypeScore() &&
            this.emailScore == other.getEmailScore() &&
            this.firstNameScore == other.getFirstNameScore() &&
            this.lastNameScore == other.getLastNameScore() &&
            this.phoneNoScore == other.getPhoneNoScore() &&
            this.purchaseTypeScore == other.getPurchaseTypeScore() &&
            this.score == other.getScore() &&
            this.stateScore == other.getStateScore() &&
            this.timeFrameScore == other.getTimeFrameScore() &&
            this.zipCityStateScore == other.getZipCityStateScore() &&
            this.zipCodeScore == other.getZipCodeScore();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getCityScore()).hashCode();
        _hashCode += (isContactFlagSet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getContactTimeScore()).hashCode();
        _hashCode += new Double(getContactTypeScore()).hashCode();
        _hashCode += new Double(getEmailScore()).hashCode();
        _hashCode += new Double(getFirstNameScore()).hashCode();
        _hashCode += new Double(getLastNameScore()).hashCode();
        _hashCode += new Double(getPhoneNoScore()).hashCode();
        _hashCode += new Double(getPurchaseTypeScore()).hashCode();
        _hashCode += new Double(getScore()).hashCode();
        _hashCode += new Double(getStateScore()).hashCode();
        _hashCode += new Double(getTimeFrameScore()).hashCode();
        _hashCode += new Double(getZipCityStateScore()).hashCode();
        _hashCode += new Double(getZipCodeScore()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LeadScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model", "LeadScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "cityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactFlagSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "contactFlagSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactTimeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "contactTimeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactTypeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "contactTypeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "emailScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstNameScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "firstNameScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "lastNameScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNoScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "phoneNoScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTypeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "purchaseTypeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "stateScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFrameScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "timeFrameScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCityStateScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "zipCityStateScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCodeScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model", "zipCodeScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
