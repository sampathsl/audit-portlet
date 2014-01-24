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

<%
long auditEventId = ParamUtil.getLong(request, "auditEventId");
%>

<portlet:renderURL var="viewURL" />
<c:set var="tabs1" value='<%= ParamUtil.getString(request, "tabs1", "report-events") %>' />

<liferay-ui:tabs names="report-events,report-page-views" url="${viewURL}" />

<c:choose>
	<c:when test="${tabs1 == 'report-events'}">
		<c:choose>
			<c:when test="<%= auditEventId > 0 %>">
				<liferay-util:include page="/view_audit_event.jsp" servletContext="<%= application %>" />
			</c:when>
			<c:otherwise>
				<liferay-util:include page="/search.jsp" servletContext="<%= application %>" />
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:when test="${tabs1 == 'report-page-views'}">
		<liferay-util:include page="/report-page-view.jsp" servletContext="<%= application %>" />
	</c:when>
	<c:otherwise>
		<liferay-ui:message key="report-report-not-found"/>
	</c:otherwise>
</c:choose>
