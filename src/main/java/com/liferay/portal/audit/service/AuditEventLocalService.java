package com.liferay.portal.audit.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the audit event local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditEventLocalServiceUtil
 * @see com.liferay.portal.audit.service.base.AuditEventLocalServiceBaseImpl
 * @see com.liferay.portal.audit.service.impl.AuditEventLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface AuditEventLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditEventLocalServiceUtil} to access the audit event local service. Add custom service methods to {@link com.liferay.portal.audit.service.impl.AuditEventLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the audit event to the database. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was added
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent addAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new audit event with the primary key. Does not add the audit event to the database.
    *
    * @param auditEventId the primary key for the new audit event
    * @return the new audit event
    */
    public com.liferay.portal.audit.model.AuditEvent createAuditEvent(
        long auditEventId);

    /**
    * Deletes the audit event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event that was removed
    * @throws PortalException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent deleteAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the audit event from the database. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent deleteAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.audit.model.AuditEvent fetchAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit event with the primary key.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event
    * @throws PortalException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.audit.model.AuditEvent getAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of audit events
    * @param end the upper bound of the range of audit events (not inclusive)
    * @return the range of audit events
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit events.
    *
    * @return the number of audit events
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAuditEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the audit event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent updateAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the audit event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @param merge whether to merge the audit event with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the audit event that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent updateAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public com.liferay.portal.audit.model.AuditEvent addAuditEvent(
        com.liferay.portal.kernel.audit.AuditMessage auditMessage)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        long companyId, long userId, java.lang.String userName,
        java.util.Date createDateGT, java.util.Date createDateLT,
        java.lang.String eventType, java.lang.String className,
        java.lang.String classPK, java.lang.String clientHost,
        java.lang.String clientIP, java.lang.String serverName, int serverPort,
        java.lang.String sessionID, boolean andSearch, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAuditEventsCount(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAuditEventsCount(long companyId, long userId,
        java.lang.String userName, java.util.Date createDateGT,
        java.util.Date createDateLT, java.lang.String eventType,
        java.lang.String className, java.lang.String classPK,
        java.lang.String clientHost, java.lang.String clientIP,
        java.lang.String serverName, int serverPort,
        java.lang.String sessionID, boolean andSearch)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.Object getReportList(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
