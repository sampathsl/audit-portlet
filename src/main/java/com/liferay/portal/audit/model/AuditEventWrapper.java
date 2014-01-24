package com.liferay.portal.audit.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AuditEvent}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       AuditEvent
 * @generated
 */
public class AuditEventWrapper implements AuditEvent, ModelWrapper<AuditEvent> {
    private AuditEvent _auditEvent;

    public AuditEventWrapper(AuditEvent auditEvent) {
        _auditEvent = auditEvent;
    }

    public Class<?> getModelClass() {
        return AuditEvent.class;
    }

    public String getModelClassName() {
        return AuditEvent.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("auditEventId", getAuditEventId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("eventType", getEventType());
        attributes.put("className", getClassName());
        attributes.put("classPK", getClassPK());
        attributes.put("message", getMessage());
        attributes.put("clientHost", getClientHost());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverName", getServerName());
        attributes.put("serverPort", getServerPort());
        attributes.put("sessionID", getSessionID());
        attributes.put("additionalInfo", getAdditionalInfo());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long auditEventId = (Long) attributes.get("auditEventId");

        if (auditEventId != null) {
            setAuditEventId(auditEventId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        String eventType = (String) attributes.get("eventType");

        if (eventType != null) {
            setEventType(eventType);
        }

        String className = (String) attributes.get("className");

        if (className != null) {
            setClassName(className);
        }

        String classPK = (String) attributes.get("classPK");

        if (classPK != null) {
            setClassPK(classPK);
        }

        String message = (String) attributes.get("message");

        if (message != null) {
            setMessage(message);
        }

        String clientHost = (String) attributes.get("clientHost");

        if (clientHost != null) {
            setClientHost(clientHost);
        }

        String clientIP = (String) attributes.get("clientIP");

        if (clientIP != null) {
            setClientIP(clientIP);
        }

        String serverName = (String) attributes.get("serverName");

        if (serverName != null) {
            setServerName(serverName);
        }

        Integer serverPort = (Integer) attributes.get("serverPort");

        if (serverPort != null) {
            setServerPort(serverPort);
        }

        String sessionID = (String) attributes.get("sessionID");

        if (sessionID != null) {
            setSessionID(sessionID);
        }

        String additionalInfo = (String) attributes.get("additionalInfo");

        if (additionalInfo != null) {
            setAdditionalInfo(additionalInfo);
        }
    }

    /**
    * Returns the primary key of this audit event.
    *
    * @return the primary key of this audit event
    */
    public long getPrimaryKey() {
        return _auditEvent.getPrimaryKey();
    }

    /**
    * Sets the primary key of this audit event.
    *
    * @param primaryKey the primary key of this audit event
    */
    public void setPrimaryKey(long primaryKey) {
        _auditEvent.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the audit event ID of this audit event.
    *
    * @return the audit event ID of this audit event
    */
    public long getAuditEventId() {
        return _auditEvent.getAuditEventId();
    }

    /**
    * Sets the audit event ID of this audit event.
    *
    * @param auditEventId the audit event ID of this audit event
    */
    public void setAuditEventId(long auditEventId) {
        _auditEvent.setAuditEventId(auditEventId);
    }

    /**
    * Returns the company ID of this audit event.
    *
    * @return the company ID of this audit event
    */
    public long getCompanyId() {
        return _auditEvent.getCompanyId();
    }

    /**
    * Sets the company ID of this audit event.
    *
    * @param companyId the company ID of this audit event
    */
    public void setCompanyId(long companyId) {
        _auditEvent.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this audit event.
    *
    * @return the user ID of this audit event
    */
    public long getUserId() {
        return _auditEvent.getUserId();
    }

    /**
    * Sets the user ID of this audit event.
    *
    * @param userId the user ID of this audit event
    */
    public void setUserId(long userId) {
        _auditEvent.setUserId(userId);
    }

    /**
    * Returns the user uuid of this audit event.
    *
    * @return the user uuid of this audit event
    * @throws SystemException if a system exception occurred
    */
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _auditEvent.getUserUuid();
    }

    /**
    * Sets the user uuid of this audit event.
    *
    * @param userUuid the user uuid of this audit event
    */
    public void setUserUuid(java.lang.String userUuid) {
        _auditEvent.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this audit event.
    *
    * @return the user name of this audit event
    */
    public java.lang.String getUserName() {
        return _auditEvent.getUserName();
    }

    /**
    * Sets the user name of this audit event.
    *
    * @param userName the user name of this audit event
    */
    public void setUserName(java.lang.String userName) {
        _auditEvent.setUserName(userName);
    }

    /**
    * Returns the create date of this audit event.
    *
    * @return the create date of this audit event
    */
    public java.util.Date getCreateDate() {
        return _auditEvent.getCreateDate();
    }

    /**
    * Sets the create date of this audit event.
    *
    * @param createDate the create date of this audit event
    */
    public void setCreateDate(java.util.Date createDate) {
        _auditEvent.setCreateDate(createDate);
    }

    /**
    * Returns the event type of this audit event.
    *
    * @return the event type of this audit event
    */
    public java.lang.String getEventType() {
        return _auditEvent.getEventType();
    }

    /**
    * Sets the event type of this audit event.
    *
    * @param eventType the event type of this audit event
    */
    public void setEventType(java.lang.String eventType) {
        _auditEvent.setEventType(eventType);
    }

    /**
    * Returns the class name of this audit event.
    *
    * @return the class name of this audit event
    */
    public java.lang.String getClassName() {
        return _auditEvent.getClassName();
    }

    /**
    * Sets the class name of this audit event.
    *
    * @param className the class name of this audit event
    */
    public void setClassName(java.lang.String className) {
        _auditEvent.setClassName(className);
    }

    /**
    * Returns the class p k of this audit event.
    *
    * @return the class p k of this audit event
    */
    public java.lang.String getClassPK() {
        return _auditEvent.getClassPK();
    }

    /**
    * Sets the class p k of this audit event.
    *
    * @param classPK the class p k of this audit event
    */
    public void setClassPK(java.lang.String classPK) {
        _auditEvent.setClassPK(classPK);
    }

    /**
    * Returns the message of this audit event.
    *
    * @return the message of this audit event
    */
    public java.lang.String getMessage() {
        return _auditEvent.getMessage();
    }

    /**
    * Sets the message of this audit event.
    *
    * @param message the message of this audit event
    */
    public void setMessage(java.lang.String message) {
        _auditEvent.setMessage(message);
    }

    /**
    * Returns the client host of this audit event.
    *
    * @return the client host of this audit event
    */
    public java.lang.String getClientHost() {
        return _auditEvent.getClientHost();
    }

    /**
    * Sets the client host of this audit event.
    *
    * @param clientHost the client host of this audit event
    */
    public void setClientHost(java.lang.String clientHost) {
        _auditEvent.setClientHost(clientHost);
    }

    /**
    * Returns the client i p of this audit event.
    *
    * @return the client i p of this audit event
    */
    public java.lang.String getClientIP() {
        return _auditEvent.getClientIP();
    }

    /**
    * Sets the client i p of this audit event.
    *
    * @param clientIP the client i p of this audit event
    */
    public void setClientIP(java.lang.String clientIP) {
        _auditEvent.setClientIP(clientIP);
    }

    /**
    * Returns the server name of this audit event.
    *
    * @return the server name of this audit event
    */
    public java.lang.String getServerName() {
        return _auditEvent.getServerName();
    }

    /**
    * Sets the server name of this audit event.
    *
    * @param serverName the server name of this audit event
    */
    public void setServerName(java.lang.String serverName) {
        _auditEvent.setServerName(serverName);
    }

    /**
    * Returns the server port of this audit event.
    *
    * @return the server port of this audit event
    */
    public int getServerPort() {
        return _auditEvent.getServerPort();
    }

    /**
    * Sets the server port of this audit event.
    *
    * @param serverPort the server port of this audit event
    */
    public void setServerPort(int serverPort) {
        _auditEvent.setServerPort(serverPort);
    }

    /**
    * Returns the session i d of this audit event.
    *
    * @return the session i d of this audit event
    */
    public java.lang.String getSessionID() {
        return _auditEvent.getSessionID();
    }

    /**
    * Sets the session i d of this audit event.
    *
    * @param sessionID the session i d of this audit event
    */
    public void setSessionID(java.lang.String sessionID) {
        _auditEvent.setSessionID(sessionID);
    }

    /**
    * Returns the additional info of this audit event.
    *
    * @return the additional info of this audit event
    */
    public java.lang.String getAdditionalInfo() {
        return _auditEvent.getAdditionalInfo();
    }

    /**
    * Sets the additional info of this audit event.
    *
    * @param additionalInfo the additional info of this audit event
    */
    public void setAdditionalInfo(java.lang.String additionalInfo) {
        _auditEvent.setAdditionalInfo(additionalInfo);
    }

    public boolean isNew() {
        return _auditEvent.isNew();
    }

    public void setNew(boolean n) {
        _auditEvent.setNew(n);
    }

    public boolean isCachedModel() {
        return _auditEvent.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _auditEvent.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _auditEvent.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _auditEvent.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _auditEvent.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _auditEvent.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _auditEvent.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AuditEventWrapper((AuditEvent) _auditEvent.clone());
    }

    public int compareTo(com.liferay.portal.audit.model.AuditEvent auditEvent) {
        return _auditEvent.compareTo(auditEvent);
    }

    @Override
    public int hashCode() {
        return _auditEvent.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.liferay.portal.audit.model.AuditEvent> toCacheModel() {
        return _auditEvent.toCacheModel();
    }

    public com.liferay.portal.audit.model.AuditEvent toEscapedModel() {
        return new AuditEventWrapper(_auditEvent.toEscapedModel());
    }

    public com.liferay.portal.audit.model.AuditEvent toUnescapedModel() {
        return new AuditEventWrapper(_auditEvent.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _auditEvent.toString();
    }

    public java.lang.String toXmlString() {
        return _auditEvent.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _auditEvent.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AuditEventWrapper)) {
            return false;
        }

        AuditEventWrapper auditEventWrapper = (AuditEventWrapper) obj;

        if (Validator.equals(_auditEvent, auditEventWrapper._auditEvent)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public AuditEvent getWrappedAuditEvent() {
        return _auditEvent;
    }

    public AuditEvent getWrappedModel() {
        return _auditEvent;
    }

    public void resetOriginalValues() {
        _auditEvent.resetOriginalValues();
    }
}
