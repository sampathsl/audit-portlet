package com.liferay.portal.audit.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the audit event local service. This utility wraps {@link com.liferay.portal.audit.service.impl.AuditEventLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditEventLocalService
 * @see com.liferay.portal.audit.service.base.AuditEventLocalServiceBaseImpl
 * @see com.liferay.portal.audit.service.impl.AuditEventLocalServiceImpl
 * @generated
 */
public class AuditEventLocalServiceUtil {
    private static AuditEventLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.audit.service.impl.AuditEventLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the audit event to the database. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent addAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAuditEvent(auditEvent);
    }

    /**
    * Creates a new audit event with the primary key. Does not add the audit event to the database.
    *
    * @param auditEventId the primary key for the new audit event
    * @return the new audit event
    */
    public static com.liferay.portal.audit.model.AuditEvent createAuditEvent(
        long auditEventId) {
        return getService().createAuditEvent(auditEventId);
    }

    /**
    * Deletes the audit event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event that was removed
    * @throws PortalException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent deleteAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAuditEvent(auditEventId);
    }

    /**
    * Deletes the audit event from the database. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent deleteAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAuditEvent(auditEvent);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.liferay.portal.audit.model.AuditEvent fetchAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAuditEvent(auditEventId);
    }

    /**
    * Returns the audit event with the primary key.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event
    * @throws PortalException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent getAuditEvent(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditEvent(auditEventId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

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
    public static java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditEvents(start, end);
    }

    /**
    * Returns the number of audit events.
    *
    * @return the number of audit events
    * @throws SystemException if a system exception occurred
    */
    public static int getAuditEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditEventsCount();
    }

    /**
    * Updates the audit event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @return the audit event that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent updateAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAuditEvent(auditEvent);
    }

    /**
    * Updates the audit event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param auditEvent the audit event
    * @param merge whether to merge the audit event with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the audit event that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.audit.model.AuditEvent updateAuditEvent(
        com.liferay.portal.audit.model.AuditEvent auditEvent, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAuditEvent(auditEvent, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.portal.audit.model.AuditEvent addAuditEvent(
        com.liferay.portal.kernel.audit.AuditMessage auditMessage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAuditEvent(auditMessage);
    }

    public static java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getAuditEvents(companyId, start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portal.audit.model.AuditEvent> getAuditEvents(
        long companyId, long userId, java.lang.String userName,
        java.util.Date createDateGT, java.util.Date createDateLT,
        java.lang.String eventType, java.lang.String className,
        java.lang.String classPK, java.lang.String clientHost,
        java.lang.String clientIP, java.lang.String serverName, int serverPort,
        java.lang.String sessionID, boolean andSearch, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getAuditEvents(companyId, userId, userName, createDateGT,
            createDateLT, eventType, className, classPK, clientHost, clientIP,
            serverName, serverPort, sessionID, andSearch, start, end,
            orderByComparator);
    }

    public static int getAuditEventsCount(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAuditEventsCount(companyId);
    }

    public static int getAuditEventsCount(long companyId, long userId,
        java.lang.String userName, java.util.Date createDateGT,
        java.util.Date createDateLT, java.lang.String eventType,
        java.lang.String className, java.lang.String classPK,
        java.lang.String clientHost, java.lang.String clientIP,
        java.lang.String serverName, int serverPort,
        java.lang.String sessionID, boolean andSearch)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getAuditEventsCount(companyId, userId, userName,
            createDateGT, createDateLT, eventType, className, classPK,
            clientHost, clientIP, serverName, serverPort, sessionID, andSearch);
    }

    public static java.lang.Object getReportList(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getReportList(start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static AuditEventLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AuditEventLocalService.class.getName());

            if (invokableLocalService instanceof AuditEventLocalService) {
                _service = (AuditEventLocalService) invokableLocalService;
            } else {
                _service = new AuditEventLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AuditEventLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(AuditEventLocalService service) {
    }
}
