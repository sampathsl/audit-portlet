<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
--%>

<%@ include file="/init.jsp" %>
<%@ taglib uri="http://www.liferay.com" prefix="r" %>
<%@page import="com.liferay.portal.audit.service.AuditEventLocalServiceUtil"%>

<c:set var="list" value="<%= AuditEventLocalServiceUtil.getReportList(-1, -1) %>" />
<c:set var="listSize" value="${list.size()}" />

<liferay-ui:search-container deltaConfigurable="false" emptyResultsMessage="there-are-no-entries">
	<liferay-ui:search-container-results results="${list}" total="${listSize}" />
	<liferay-ui:search-container-row className="java.lang.Object" escapedModel="true" modelVar="line">
		<liferay-ui:search-container-column-text name="userName">
		<c:choose>
			<c:when test="${line[0] eq null || line[0] eq ''}">
				<liferay-ui:message key="user-gest"/>
			</c:when>
			<c:otherwise>
				${line[0]}
			</c:otherwise>
		</c:choose>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="assetTitle" value="${r:getNodeXml(line[1], 'Title')}" />
		<liferay-ui:search-container-column-text name="quantity" value="${line[2]}" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
