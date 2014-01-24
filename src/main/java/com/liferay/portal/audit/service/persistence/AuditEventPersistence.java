package com.liferay.portal.audit.service.persistence;

import com.liferay.portal.audit.model.AuditEvent;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the audit event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AuditEventPersistenceImpl
 * @see AuditEventUtil
 * @generated
 */
public interface AuditEventPersistence extends BasePersistence<AuditEvent> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AuditEventUtil} to access the audit event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the audit event in the entity cache if it is enabled.
    *
    * @param auditEvent the audit event
    */
    public void cacheResult(
        com.liferay.portal.audit.model.AuditEvent auditEvent);

    /**
    * Caches the audit events in the entity cache if it is enabled.
    *
    * @param auditEvents the audit events
    */
    public void cacheResult(
        java.util.List<com.liferay.portal.audit.model.AuditEvent> auditEvents);

    /**
    * Creates a new audit event with the primary key. Does not add the audit event to the database.
    *
    * @param auditEventId the primary key for the new audit event
    * @return the new audit event
    */
    public com.liferay.portal.audit.model.AuditEvent create(long auditEventId);

    /**
    * Removes the audit event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event that was removed
    * @throws com.liferay.portal.audit.NoSuchEventException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent remove(long auditEventId)
        throws com.liferay.portal.audit.NoSuchEventException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.audit.model.AuditEvent updateImpl(
        com.liferay.portal.audit.model.AuditEvent auditEvent, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit event with the primary key or throws a {@link com.liferay.portal.audit.NoSuchEventException} if it could not be found.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event
    * @throws com.liferay.portal.audit.NoSuchEventException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent findByPrimaryKey(
        long auditEventId)
        throws com.liferay.portal.audit.NoSuchEventException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param auditEventId the primary key of the audit event
    * @return the audit event, or <code>null</code> if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent fetchByPrimaryKey(
        long auditEventId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit events where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching audit events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the audit events where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of audit events
    * @param end the upper bound of the range of audit events (not inclusive)
    * @return the range of matching audit events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit events where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of audit events
    * @param end the upper bound of the range of audit events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching audit events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit event in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit event
    * @throws com.liferay.portal.audit.NoSuchEventException if a matching audit event could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.audit.NoSuchEventException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first audit event in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching audit event, or <code>null</code> if a matching audit event could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit event in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit event
    * @throws com.liferay.portal.audit.NoSuchEventException if a matching audit event could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.audit.NoSuchEventException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last audit event in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching audit event, or <code>null</code> if a matching audit event could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the audit events before and after the current audit event in the ordered set where companyId = &#63;.
    *
    * @param auditEventId the primary key of the current audit event
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next audit event
    * @throws com.liferay.portal.audit.NoSuchEventException if a audit event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.portal.audit.model.AuditEvent[] findByCompanyId_PrevAndNext(
        long auditEventId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.audit.NoSuchEventException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the audit events.
    *
    * @return the audit events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the audit events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of audit events
    * @param end the upper bound of the range of audit events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of audit events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.portal.audit.model.AuditEvent> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit events where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the audit events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit events where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching audit events
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of audit events.
    *
    * @return the number of audit events
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
