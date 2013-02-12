/**
 * TimeZoneCorrection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Oct 03, 2009 (03:44:44 CDT) WSDL2Java emitter.
 */

package com.mgipaypal.ac1211.client;

public class TimeZoneCorrection  implements java.io.Serializable {
    private java.lang.String timeZoneId;

    private java.lang.Integer offset;

    private java.lang.Integer dstSavings;

    private java.lang.Integer startMode;

    private java.lang.Integer startDay;

    private java.lang.Integer startMonth;

    private java.lang.Integer startDayOfWeek;

    private java.lang.Integer startTime;

    private java.lang.Integer startTimeMode;

    private java.lang.Integer endMode;

    private java.lang.Integer endDay;

    private java.lang.Integer endMonth;

    private java.lang.Integer endDayOfWeek;

    private java.lang.Integer endTime;

    private java.lang.Integer endTimeMode;

    public TimeZoneCorrection() {
    }

    public TimeZoneCorrection(
           java.lang.String timeZoneId,
           java.lang.Integer offset,
           java.lang.Integer dstSavings,
           java.lang.Integer startMode,
           java.lang.Integer startDay,
           java.lang.Integer startMonth,
           java.lang.Integer startDayOfWeek,
           java.lang.Integer startTime,
           java.lang.Integer startTimeMode,
           java.lang.Integer endMode,
           java.lang.Integer endDay,
           java.lang.Integer endMonth,
           java.lang.Integer endDayOfWeek,
           java.lang.Integer endTime,
           java.lang.Integer endTimeMode) {
           this.timeZoneId = timeZoneId;
           this.offset = offset;
           this.dstSavings = dstSavings;
           this.startMode = startMode;
           this.startDay = startDay;
           this.startMonth = startMonth;
           this.startDayOfWeek = startDayOfWeek;
           this.startTime = startTime;
           this.startTimeMode = startTimeMode;
           this.endMode = endMode;
           this.endDay = endDay;
           this.endMonth = endMonth;
           this.endDayOfWeek = endDayOfWeek;
           this.endTime = endTime;
           this.endTimeMode = endTimeMode;
    }


    /**
     * Gets the timeZoneId value for this TimeZoneCorrection.
     * 
     * @return timeZoneId
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this TimeZoneCorrection.
     * 
     * @param timeZoneId
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the offset value for this TimeZoneCorrection.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this TimeZoneCorrection.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the dstSavings value for this TimeZoneCorrection.
     * 
     * @return dstSavings
     */
    public java.lang.Integer getDstSavings() {
        return dstSavings;
    }


    /**
     * Sets the dstSavings value for this TimeZoneCorrection.
     * 
     * @param dstSavings
     */
    public void setDstSavings(java.lang.Integer dstSavings) {
        this.dstSavings = dstSavings;
    }


    /**
     * Gets the startMode value for this TimeZoneCorrection.
     * 
     * @return startMode
     */
    public java.lang.Integer getStartMode() {
        return startMode;
    }


    /**
     * Sets the startMode value for this TimeZoneCorrection.
     * 
     * @param startMode
     */
    public void setStartMode(java.lang.Integer startMode) {
        this.startMode = startMode;
    }


    /**
     * Gets the startDay value for this TimeZoneCorrection.
     * 
     * @return startDay
     */
    public java.lang.Integer getStartDay() {
        return startDay;
    }


    /**
     * Sets the startDay value for this TimeZoneCorrection.
     * 
     * @param startDay
     */
    public void setStartDay(java.lang.Integer startDay) {
        this.startDay = startDay;
    }


    /**
     * Gets the startMonth value for this TimeZoneCorrection.
     * 
     * @return startMonth
     */
    public java.lang.Integer getStartMonth() {
        return startMonth;
    }


    /**
     * Sets the startMonth value for this TimeZoneCorrection.
     * 
     * @param startMonth
     */
    public void setStartMonth(java.lang.Integer startMonth) {
        this.startMonth = startMonth;
    }


    /**
     * Gets the startDayOfWeek value for this TimeZoneCorrection.
     * 
     * @return startDayOfWeek
     */
    public java.lang.Integer getStartDayOfWeek() {
        return startDayOfWeek;
    }


    /**
     * Sets the startDayOfWeek value for this TimeZoneCorrection.
     * 
     * @param startDayOfWeek
     */
    public void setStartDayOfWeek(java.lang.Integer startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
    }


    /**
     * Gets the startTime value for this TimeZoneCorrection.
     * 
     * @return startTime
     */
    public java.lang.Integer getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TimeZoneCorrection.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.Integer startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the startTimeMode value for this TimeZoneCorrection.
     * 
     * @return startTimeMode
     */
    public java.lang.Integer getStartTimeMode() {
        return startTimeMode;
    }


    /**
     * Sets the startTimeMode value for this TimeZoneCorrection.
     * 
     * @param startTimeMode
     */
    public void setStartTimeMode(java.lang.Integer startTimeMode) {
        this.startTimeMode = startTimeMode;
    }


    /**
     * Gets the endMode value for this TimeZoneCorrection.
     * 
     * @return endMode
     */
    public java.lang.Integer getEndMode() {
        return endMode;
    }


    /**
     * Sets the endMode value for this TimeZoneCorrection.
     * 
     * @param endMode
     */
    public void setEndMode(java.lang.Integer endMode) {
        this.endMode = endMode;
    }


    /**
     * Gets the endDay value for this TimeZoneCorrection.
     * 
     * @return endDay
     */
    public java.lang.Integer getEndDay() {
        return endDay;
    }


    /**
     * Sets the endDay value for this TimeZoneCorrection.
     * 
     * @param endDay
     */
    public void setEndDay(java.lang.Integer endDay) {
        this.endDay = endDay;
    }


    /**
     * Gets the endMonth value for this TimeZoneCorrection.
     * 
     * @return endMonth
     */
    public java.lang.Integer getEndMonth() {
        return endMonth;
    }


    /**
     * Sets the endMonth value for this TimeZoneCorrection.
     * 
     * @param endMonth
     */
    public void setEndMonth(java.lang.Integer endMonth) {
        this.endMonth = endMonth;
    }


    /**
     * Gets the endDayOfWeek value for this TimeZoneCorrection.
     * 
     * @return endDayOfWeek
     */
    public java.lang.Integer getEndDayOfWeek() {
        return endDayOfWeek;
    }


    /**
     * Sets the endDayOfWeek value for this TimeZoneCorrection.
     * 
     * @param endDayOfWeek
     */
    public void setEndDayOfWeek(java.lang.Integer endDayOfWeek) {
        this.endDayOfWeek = endDayOfWeek;
    }


    /**
     * Gets the endTime value for this TimeZoneCorrection.
     * 
     * @return endTime
     */
    public java.lang.Integer getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TimeZoneCorrection.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.Integer endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the endTimeMode value for this TimeZoneCorrection.
     * 
     * @return endTimeMode
     */
    public java.lang.Integer getEndTimeMode() {
        return endTimeMode;
    }


    /**
     * Sets the endTimeMode value for this TimeZoneCorrection.
     * 
     * @param endTimeMode
     */
    public void setEndTimeMode(java.lang.Integer endTimeMode) {
        this.endTimeMode = endTimeMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeZoneCorrection)) return false;
        TimeZoneCorrection other = (TimeZoneCorrection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.dstSavings==null && other.getDstSavings()==null) || 
             (this.dstSavings!=null &&
              this.dstSavings.equals(other.getDstSavings()))) &&
            ((this.startMode==null && other.getStartMode()==null) || 
             (this.startMode!=null &&
              this.startMode.equals(other.getStartMode()))) &&
            ((this.startDay==null && other.getStartDay()==null) || 
             (this.startDay!=null &&
              this.startDay.equals(other.getStartDay()))) &&
            ((this.startMonth==null && other.getStartMonth()==null) || 
             (this.startMonth!=null &&
              this.startMonth.equals(other.getStartMonth()))) &&
            ((this.startDayOfWeek==null && other.getStartDayOfWeek()==null) || 
             (this.startDayOfWeek!=null &&
              this.startDayOfWeek.equals(other.getStartDayOfWeek()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.startTimeMode==null && other.getStartTimeMode()==null) || 
             (this.startTimeMode!=null &&
              this.startTimeMode.equals(other.getStartTimeMode()))) &&
            ((this.endMode==null && other.getEndMode()==null) || 
             (this.endMode!=null &&
              this.endMode.equals(other.getEndMode()))) &&
            ((this.endDay==null && other.getEndDay()==null) || 
             (this.endDay!=null &&
              this.endDay.equals(other.getEndDay()))) &&
            ((this.endMonth==null && other.getEndMonth()==null) || 
             (this.endMonth!=null &&
              this.endMonth.equals(other.getEndMonth()))) &&
            ((this.endDayOfWeek==null && other.getEndDayOfWeek()==null) || 
             (this.endDayOfWeek!=null &&
              this.endDayOfWeek.equals(other.getEndDayOfWeek()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.endTimeMode==null && other.getEndTimeMode()==null) || 
             (this.endTimeMode!=null &&
              this.endTimeMode.equals(other.getEndTimeMode())));
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
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getDstSavings() != null) {
            _hashCode += getDstSavings().hashCode();
        }
        if (getStartMode() != null) {
            _hashCode += getStartMode().hashCode();
        }
        if (getStartDay() != null) {
            _hashCode += getStartDay().hashCode();
        }
        if (getStartMonth() != null) {
            _hashCode += getStartMonth().hashCode();
        }
        if (getStartDayOfWeek() != null) {
            _hashCode += getStartDayOfWeek().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStartTimeMode() != null) {
            _hashCode += getStartTimeMode().hashCode();
        }
        if (getEndMode() != null) {
            _hashCode += getEndMode().hashCode();
        }
        if (getEndDay() != null) {
            _hashCode += getEndDay().hashCode();
        }
        if (getEndMonth() != null) {
            _hashCode += getEndMonth().hashCode();
        }
        if (getEndDayOfWeek() != null) {
            _hashCode += getEndDayOfWeek().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getEndTimeMode() != null) {
            _hashCode += getEndTimeMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeZoneCorrection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeZoneCorrection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dstSavings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "dstSavings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "startTimeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTimeMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.moneygram.com/AgentConnect1211", "endTimeMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
