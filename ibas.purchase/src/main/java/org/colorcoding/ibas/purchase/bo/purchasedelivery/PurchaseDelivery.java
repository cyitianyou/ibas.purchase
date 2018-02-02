package org.colorcoding.ibas.purchase.bo.purchasedelivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.colorcoding.ibas.bobas.approval.IApprovalData;
import org.colorcoding.ibas.bobas.bo.BusinessObject;
import org.colorcoding.ibas.bobas.core.IPropertyInfo;
import org.colorcoding.ibas.bobas.data.DateTime;
import org.colorcoding.ibas.bobas.data.Decimal;
import org.colorcoding.ibas.bobas.data.emApprovalStatus;
import org.colorcoding.ibas.bobas.data.emBOStatus;
import org.colorcoding.ibas.bobas.data.emDocumentStatus;
import org.colorcoding.ibas.bobas.data.emYesNo;
import org.colorcoding.ibas.bobas.mapping.BOCode;
import org.colorcoding.ibas.bobas.mapping.DbField;
import org.colorcoding.ibas.bobas.mapping.DbFieldType;
import org.colorcoding.ibas.bobas.ownership.IDataOwnership;
import org.colorcoding.ibas.bobas.rule.IBusinessRule;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleMinValue;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleMultiplication;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleRequired;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleRequiredElements;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleSumElements;
import org.colorcoding.ibas.bobas.rule.common.BusinessRuleSummation;
import org.colorcoding.ibas.purchase.MyConfiguration;
import org.colorcoding.ibas.purchase.bo.shippingaddress.IShippingAddresss;
import org.colorcoding.ibas.purchase.bo.shippingaddress.ShippingAddress;
import org.colorcoding.ibas.purchase.bo.shippingaddress.ShippingAddresss;

/**
 * 获取-采购收货
 * 
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = PurchaseDelivery.BUSINESS_OBJECT_NAME, namespace = MyConfiguration.NAMESPACE_BO)
@XmlRootElement(name = PurchaseDelivery.BUSINESS_OBJECT_NAME, namespace = MyConfiguration.NAMESPACE_BO)
@BOCode(PurchaseDelivery.BUSINESS_OBJECT_CODE)
public class PurchaseDelivery extends BusinessObject<PurchaseDelivery>
		implements IPurchaseDelivery, IDataOwnership, IApprovalData {

	/**
	 * 序列化版本标记
	 */
	private static final long serialVersionUID = 7063691341661262969L;

	/**
	 * 当前类型
	 */
	private static final Class<?> MY_CLASS = PurchaseDelivery.class;

	/**
	 * 数据库表
	 */
	public static final String DB_TABLE_NAME = "${Company}_PH_OPDN";

	/**
	 * 业务对象编码
	 */
	public static final String BUSINESS_OBJECT_CODE = "${Company}_PH_PURCHDELIVERY";

	/**
	 * 业务对象名称
	 */
	public static final String BUSINESS_OBJECT_NAME = "PurchaseDelivery";

	/**
	 * 属性名称-凭证编号
	 */
	private static final String PROPERTY_DOCENTRY_NAME = "DocEntry";

	/**
	 * 凭证编号 属性
	 */
	@DbField(name = "DocEntry", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = true)
	public static final IPropertyInfo<Integer> PROPERTY_DOCENTRY = registerProperty(PROPERTY_DOCENTRY_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-凭证编号
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCENTRY_NAME)
	public final Integer getDocEntry() {
		return this.getProperty(PROPERTY_DOCENTRY);
	}

	/**
	 * 设置-凭证编号
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocEntry(Integer value) {
		this.setProperty(PROPERTY_DOCENTRY, value);
	}

	/**
	 * 属性名称-期间编号
	 */
	private static final String PROPERTY_DOCNUM_NAME = "DocNum";

	/**
	 * 期间编号 属性
	 */
	@DbField(name = "DocNum", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_DOCNUM = registerProperty(PROPERTY_DOCNUM_NAME, Integer.class,
			MY_CLASS);

	/**
	 * 获取-期间编号
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCNUM_NAME)
	public final Integer getDocNum() {
		return this.getProperty(PROPERTY_DOCNUM);
	}

	/**
	 * 设置-期间编号
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocNum(Integer value) {
		this.setProperty(PROPERTY_DOCNUM, value);
	}

	/**
	 * 属性名称-期间
	 */
	private static final String PROPERTY_PERIOD_NAME = "Period";

	/**
	 * 期间 属性
	 */
	@DbField(name = "Period", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_PERIOD = registerProperty(PROPERTY_PERIOD_NAME, Integer.class,
			MY_CLASS);

	/**
	 * 获取-期间
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_PERIOD_NAME)
	public final Integer getPeriod() {
		return this.getProperty(PROPERTY_PERIOD);
	}

	/**
	 * 设置-期间
	 * 
	 * @param value
	 *            值
	 */
	public final void setPeriod(Integer value) {
		this.setProperty(PROPERTY_PERIOD, value);
	}

	/**
	 * 属性名称-取消
	 */
	private static final String PROPERTY_CANCELED_NAME = "Canceled";

	/**
	 * 取消 属性
	 */
	@DbField(name = "Canceled", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emYesNo> PROPERTY_CANCELED = registerProperty(PROPERTY_CANCELED_NAME,
			emYesNo.class, MY_CLASS);

	/**
	 * 获取-取消
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CANCELED_NAME)
	public final emYesNo getCanceled() {
		return this.getProperty(PROPERTY_CANCELED);
	}

	/**
	 * 设置-取消
	 * 
	 * @param value
	 *            值
	 */
	public final void setCanceled(emYesNo value) {
		this.setProperty(PROPERTY_CANCELED, value);
	}

	/**
	 * 属性名称-状态
	 */
	private static final String PROPERTY_STATUS_NAME = "Status";

	/**
	 * 状态 属性
	 */
	@DbField(name = "Status", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emBOStatus> PROPERTY_STATUS = registerProperty(PROPERTY_STATUS_NAME,
			emBOStatus.class, MY_CLASS);

	/**
	 * 获取-状态
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_STATUS_NAME)
	public final emBOStatus getStatus() {
		return this.getProperty(PROPERTY_STATUS);
	}

	/**
	 * 设置-状态
	 * 
	 * @param value
	 *            值
	 */
	public final void setStatus(emBOStatus value) {
		this.setProperty(PROPERTY_STATUS, value);
	}

	/**
	 * 属性名称-审批状态
	 */
	private static final String PROPERTY_APPROVALSTATUS_NAME = "ApprovalStatus";

	/**
	 * 审批状态 属性
	 */
	@DbField(name = "ApvlStatus", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emApprovalStatus> PROPERTY_APPROVALSTATUS = registerProperty(
			PROPERTY_APPROVALSTATUS_NAME, emApprovalStatus.class, MY_CLASS);

	/**
	 * 获取-审批状态
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_APPROVALSTATUS_NAME)
	public final emApprovalStatus getApprovalStatus() {
		return this.getProperty(PROPERTY_APPROVALSTATUS);
	}

	/**
	 * 设置-审批状态
	 * 
	 * @param value
	 *            值
	 */
	public final void setApprovalStatus(emApprovalStatus value) {
		this.setProperty(PROPERTY_APPROVALSTATUS, value);
	}

	/**
	 * 属性名称-单据状态
	 */
	private static final String PROPERTY_DOCUMENTSTATUS_NAME = "DocumentStatus";

	/**
	 * 单据状态 属性
	 */
	@DbField(name = "DocStatus", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emDocumentStatus> PROPERTY_DOCUMENTSTATUS = registerProperty(
			PROPERTY_DOCUMENTSTATUS_NAME, emDocumentStatus.class, MY_CLASS);

	/**
	 * 获取-单据状态
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTSTATUS_NAME)
	public final emDocumentStatus getDocumentStatus() {
		return this.getProperty(PROPERTY_DOCUMENTSTATUS);
	}

	/**
	 * 设置-单据状态
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentStatus(emDocumentStatus value) {
		this.setProperty(PROPERTY_DOCUMENTSTATUS, value);
	}

	/**
	 * 属性名称-对象类型
	 */
	private static final String PROPERTY_OBJECTCODE_NAME = "ObjectCode";

	/**
	 * 对象类型 属性
	 */
	@DbField(name = "ObjectCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_OBJECTCODE = registerProperty(PROPERTY_OBJECTCODE_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-对象类型
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_OBJECTCODE_NAME)
	public final String getObjectCode() {
		return this.getProperty(PROPERTY_OBJECTCODE);
	}

	/**
	 * 设置-对象类型
	 * 
	 * @param value
	 *            值
	 */
	public final void setObjectCode(String value) {
		this.setProperty(PROPERTY_OBJECTCODE, value);
	}

	/**
	 * 属性名称-创建日期
	 */
	private static final String PROPERTY_CREATEDATE_NAME = "CreateDate";

	/**
	 * 创建日期 属性
	 */
	@DbField(name = "CreateDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_CREATEDATE = registerProperty(PROPERTY_CREATEDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-创建日期
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CREATEDATE_NAME)
	public final DateTime getCreateDate() {
		return this.getProperty(PROPERTY_CREATEDATE);
	}

	/**
	 * 设置-创建日期
	 * 
	 * @param value
	 *            值
	 */
	public final void setCreateDate(DateTime value) {
		this.setProperty(PROPERTY_CREATEDATE, value);
	}

	/**
	 * 属性名称-创建时间
	 */
	private static final String PROPERTY_CREATETIME_NAME = "CreateTime";

	/**
	 * 创建时间 属性
	 */
	@DbField(name = "CreateTime", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Short> PROPERTY_CREATETIME = registerProperty(PROPERTY_CREATETIME_NAME,
			Short.class, MY_CLASS);

	/**
	 * 获取-创建时间
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CREATETIME_NAME)
	public final Short getCreateTime() {
		return this.getProperty(PROPERTY_CREATETIME);
	}

	/**
	 * 设置-创建时间
	 * 
	 * @param value
	 *            值
	 */
	public final void setCreateTime(Short value) {
		this.setProperty(PROPERTY_CREATETIME, value);
	}

	/**
	 * 属性名称-修改日期
	 */
	private static final String PROPERTY_UPDATEDATE_NAME = "UpdateDate";

	/**
	 * 修改日期 属性
	 */
	@DbField(name = "UpdateDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_UPDATEDATE = registerProperty(PROPERTY_UPDATEDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-修改日期
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_UPDATEDATE_NAME)
	public final DateTime getUpdateDate() {
		return this.getProperty(PROPERTY_UPDATEDATE);
	}

	/**
	 * 设置-修改日期
	 * 
	 * @param value
	 *            值
	 */
	public final void setUpdateDate(DateTime value) {
		this.setProperty(PROPERTY_UPDATEDATE, value);
	}

	/**
	 * 属性名称-修改时间
	 */
	private static final String PROPERTY_UPDATETIME_NAME = "UpdateTime";

	/**
	 * 修改时间 属性
	 */
	@DbField(name = "UpdateTime", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Short> PROPERTY_UPDATETIME = registerProperty(PROPERTY_UPDATETIME_NAME,
			Short.class, MY_CLASS);

	/**
	 * 获取-修改时间
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_UPDATETIME_NAME)
	public final Short getUpdateTime() {
		return this.getProperty(PROPERTY_UPDATETIME);
	}

	/**
	 * 设置-修改时间
	 * 
	 * @param value
	 *            值
	 */
	public final void setUpdateTime(Short value) {
		this.setProperty(PROPERTY_UPDATETIME, value);
	}

	/**
	 * 属性名称-版本
	 */
	private static final String PROPERTY_LOGINST_NAME = "LogInst";

	/**
	 * 版本 属性
	 */
	@DbField(name = "LogInst", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_LOGINST = registerProperty(PROPERTY_LOGINST_NAME, Integer.class,
			MY_CLASS);

	/**
	 * 获取-版本
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_LOGINST_NAME)
	public final Integer getLogInst() {
		return this.getProperty(PROPERTY_LOGINST);
	}

	/**
	 * 设置-版本
	 * 
	 * @param value
	 *            值
	 */
	public final void setLogInst(Integer value) {
		this.setProperty(PROPERTY_LOGINST, value);
	}

	/**
	 * 属性名称-服务系列
	 */
	private static final String PROPERTY_SERIES_NAME = "Series";

	/**
	 * 服务系列 属性
	 */
	@DbField(name = "Series", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_SERIES = registerProperty(PROPERTY_SERIES_NAME, Integer.class,
			MY_CLASS);

	/**
	 * 获取-服务系列
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_SERIES_NAME)
	public final Integer getSeries() {
		return this.getProperty(PROPERTY_SERIES);
	}

	/**
	 * 设置-服务系列
	 * 
	 * @param value
	 *            值
	 */
	public final void setSeries(Integer value) {
		this.setProperty(PROPERTY_SERIES, value);
	}

	/**
	 * 属性名称-数据源
	 */
	private static final String PROPERTY_DATASOURCE_NAME = "DataSource";

	/**
	 * 数据源 属性
	 */
	@DbField(name = "DataSource", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_DATASOURCE = registerProperty(PROPERTY_DATASOURCE_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-数据源
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DATASOURCE_NAME)
	public final String getDataSource() {
		return this.getProperty(PROPERTY_DATASOURCE);
	}

	/**
	 * 设置-数据源
	 * 
	 * @param value
	 *            值
	 */
	public final void setDataSource(String value) {
		this.setProperty(PROPERTY_DATASOURCE, value);
	}

	/**
	 * 属性名称-创建用户
	 */
	private static final String PROPERTY_CREATEUSERSIGN_NAME = "CreateUserSign";

	/**
	 * 创建用户 属性
	 */
	@DbField(name = "Creator", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_CREATEUSERSIGN = registerProperty(PROPERTY_CREATEUSERSIGN_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-创建用户
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CREATEUSERSIGN_NAME)
	public final Integer getCreateUserSign() {
		return this.getProperty(PROPERTY_CREATEUSERSIGN);
	}

	/**
	 * 设置-创建用户
	 * 
	 * @param value
	 *            值
	 */
	public final void setCreateUserSign(Integer value) {
		this.setProperty(PROPERTY_CREATEUSERSIGN, value);
	}

	/**
	 * 属性名称-修改用户
	 */
	private static final String PROPERTY_UPDATEUSERSIGN_NAME = "UpdateUserSign";

	/**
	 * 修改用户 属性
	 */
	@DbField(name = "Updator", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_UPDATEUSERSIGN = registerProperty(PROPERTY_UPDATEUSERSIGN_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-修改用户
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_UPDATEUSERSIGN_NAME)
	public final Integer getUpdateUserSign() {
		return this.getProperty(PROPERTY_UPDATEUSERSIGN);
	}

	/**
	 * 设置-修改用户
	 * 
	 * @param value
	 *            值
	 */
	public final void setUpdateUserSign(Integer value) {
		this.setProperty(PROPERTY_UPDATEUSERSIGN, value);
	}

	/**
	 * 属性名称-创建动作标识
	 */
	private static final String PROPERTY_CREATEACTIONID_NAME = "CreateActionId";

	/**
	 * 创建动作标识 属性
	 */
	@DbField(name = "CreateActId", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_CREATEACTIONID = registerProperty(PROPERTY_CREATEACTIONID_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-创建动作标识
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CREATEACTIONID_NAME)
	public final String getCreateActionId() {
		return this.getProperty(PROPERTY_CREATEACTIONID);
	}

	/**
	 * 设置-创建动作标识
	 * 
	 * @param value
	 *            值
	 */
	public final void setCreateActionId(String value) {
		this.setProperty(PROPERTY_CREATEACTIONID, value);
	}

	/**
	 * 属性名称-更新动作标识
	 */
	private static final String PROPERTY_UPDATEACTIONID_NAME = "UpdateActionId";

	/**
	 * 更新动作标识 属性
	 */
	@DbField(name = "UpdateActId", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_UPDATEACTIONID = registerProperty(PROPERTY_UPDATEACTIONID_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-更新动作标识
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_UPDATEACTIONID_NAME)
	public final String getUpdateActionId() {
		return this.getProperty(PROPERTY_UPDATEACTIONID);
	}

	/**
	 * 设置-更新动作标识
	 * 
	 * @param value
	 *            值
	 */
	public final void setUpdateActionId(String value) {
		this.setProperty(PROPERTY_UPDATEACTIONID, value);
	}

	/**
	 * 属性名称-数据所有者
	 */
	private static final String PROPERTY_DATAOWNER_NAME = "DataOwner";

	/**
	 * 数据所有者 属性
	 */
	@DbField(name = "DataOwner", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_DATAOWNER = registerProperty(PROPERTY_DATAOWNER_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-数据所有者
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DATAOWNER_NAME)
	public final Integer getDataOwner() {
		return this.getProperty(PROPERTY_DATAOWNER);
	}

	/**
	 * 设置-数据所有者
	 * 
	 * @param value
	 *            值
	 */
	public final void setDataOwner(Integer value) {
		this.setProperty(PROPERTY_DATAOWNER, value);
	}

	/**
	 * 属性名称-团队成员
	 */
	private static final String PROPERTY_TEAMMEMBERS_NAME = "TeamMembers";

	/**
	 * 团队成员 属性
	 */
	@DbField(name = "TeamMembers", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_TEAMMEMBERS = registerProperty(PROPERTY_TEAMMEMBERS_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-团队成员
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_TEAMMEMBERS_NAME)
	public final String getTeamMembers() {
		return this.getProperty(PROPERTY_TEAMMEMBERS);
	}

	/**
	 * 设置-团队成员
	 * 
	 * @param value
	 *            值
	 */
	public final void setTeamMembers(String value) {
		this.setProperty(PROPERTY_TEAMMEMBERS, value);
	}

	/**
	 * 属性名称-数据所属组织
	 */
	private static final String PROPERTY_ORGANIZATION_NAME = "Organization";

	/**
	 * 数据所属组织 属性
	 */
	@DbField(name = "OrgCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_ORGANIZATION = registerProperty(PROPERTY_ORGANIZATION_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-数据所属组织
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_ORGANIZATION_NAME)
	public final String getOrganization() {
		return this.getProperty(PROPERTY_ORGANIZATION);
	}

	/**
	 * 设置-数据所属组织
	 * 
	 * @param value
	 *            值
	 */
	public final void setOrganization(String value) {
		this.setProperty(PROPERTY_ORGANIZATION, value);
	}

	/**
	 * 属性名称-过账日期
	 */
	private static final String PROPERTY_POSTINGDATE_NAME = "PostingDate";

	/**
	 * 过账日期 属性
	 */
	@DbField(name = "DocDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_POSTINGDATE = registerProperty(PROPERTY_POSTINGDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-过账日期
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_POSTINGDATE_NAME)
	public final DateTime getPostingDate() {
		return this.getProperty(PROPERTY_POSTINGDATE);
	}

	/**
	 * 设置-过账日期
	 * 
	 * @param value
	 *            值
	 */
	public final void setPostingDate(DateTime value) {
		this.setProperty(PROPERTY_POSTINGDATE, value);
	}

	/**
	 * 属性名称-到期日
	 */
	private static final String PROPERTY_DELIVERYDATE_NAME = "DeliveryDate";

	/**
	 * 到期日 属性
	 */
	@DbField(name = "DocDueDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_DELIVERYDATE = registerProperty(PROPERTY_DELIVERYDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-到期日
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DELIVERYDATE_NAME)
	public final DateTime getDeliveryDate() {
		return this.getProperty(PROPERTY_DELIVERYDATE);
	}

	/**
	 * 设置-到期日
	 * 
	 * @param value
	 *            值
	 */
	public final void setDeliveryDate(DateTime value) {
		this.setProperty(PROPERTY_DELIVERYDATE, value);
	}

	/**
	 * 属性名称-凭证日期
	 */
	private static final String PROPERTY_DOCUMENTDATE_NAME = "DocumentDate";

	/**
	 * 凭证日期 属性
	 */
	@DbField(name = "TaxDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<DateTime> PROPERTY_DOCUMENTDATE = registerProperty(PROPERTY_DOCUMENTDATE_NAME,
			DateTime.class, MY_CLASS);

	/**
	 * 获取-凭证日期
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTDATE_NAME)
	public final DateTime getDocumentDate() {
		return this.getProperty(PROPERTY_DOCUMENTDATE);
	}

	/**
	 * 设置-凭证日期
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentDate(DateTime value) {
		this.setProperty(PROPERTY_DOCUMENTDATE, value);
	}

	/**
	 * 属性名称-参考1
	 */
	private static final String PROPERTY_REFERENCE1_NAME = "Reference1";

	/**
	 * 参考1 属性
	 */
	@DbField(name = "Ref1", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_REFERENCE1 = registerProperty(PROPERTY_REFERENCE1_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-参考1
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_REFERENCE1_NAME)
	public final String getReference1() {
		return this.getProperty(PROPERTY_REFERENCE1);
	}

	/**
	 * 设置-参考1
	 * 
	 * @param value
	 *            值
	 */
	public final void setReference1(String value) {
		this.setProperty(PROPERTY_REFERENCE1, value);
	}

	/**
	 * 属性名称-参考2
	 */
	private static final String PROPERTY_REFERENCE2_NAME = "Reference2";

	/**
	 * 参考2 属性
	 */
	@DbField(name = "Ref2", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_REFERENCE2 = registerProperty(PROPERTY_REFERENCE2_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-参考2
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_REFERENCE2_NAME)
	public final String getReference2() {
		return this.getProperty(PROPERTY_REFERENCE2);
	}

	/**
	 * 设置-参考2
	 * 
	 * @param value
	 *            值
	 */
	public final void setReference2(String value) {
		this.setProperty(PROPERTY_REFERENCE2, value);
	}

	/**
	 * 属性名称-备注
	 */
	private static final String PROPERTY_REMARKS_NAME = "Remarks";

	/**
	 * 备注 属性
	 */
	@DbField(name = "Remarks", type = DbFieldType.MEMO, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_REMARKS = registerProperty(PROPERTY_REMARKS_NAME, String.class,
			MY_CLASS);

	/**
	 * 获取-备注
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_REMARKS_NAME)
	public final String getRemarks() {
		return this.getProperty(PROPERTY_REMARKS);
	}

	/**
	 * 设置-备注
	 * 
	 * @param value
	 *            值
	 */
	public final void setRemarks(String value) {
		this.setProperty(PROPERTY_REMARKS, value);
	}

	/**
	 * 属性名称-已引用
	 */
	private static final String PROPERTY_REFERENCED_NAME = "Referenced";

	/**
	 * 已引用 属性
	 */
	@DbField(name = "Refed", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emYesNo> PROPERTY_REFERENCED = registerProperty(PROPERTY_REFERENCED_NAME,
			emYesNo.class, MY_CLASS);

	/**
	 * 获取-已引用
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_REFERENCED_NAME)
	public final emYesNo getReferenced() {
		return this.getProperty(PROPERTY_REFERENCED);
	}

	/**
	 * 设置-已引用
	 * 
	 * @param value
	 *            值
	 */
	public final void setReferenced(emYesNo value) {
		this.setProperty(PROPERTY_REFERENCED, value);
	}

	/**
	 * 属性名称-已删除
	 */
	private static final String PROPERTY_DELETED_NAME = "Deleted";

	/**
	 * 已删除 属性
	 */
	@DbField(name = "Deleted", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emYesNo> PROPERTY_DELETED = registerProperty(PROPERTY_DELETED_NAME, emYesNo.class,
			MY_CLASS);

	/**
	 * 获取-已删除
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DELETED_NAME)
	public final emYesNo getDeleted() {
		return this.getProperty(PROPERTY_DELETED);
	}

	/**
	 * 设置-已删除
	 * 
	 * @param value
	 *            值
	 */
	public final void setDeleted(emYesNo value) {
		this.setProperty(PROPERTY_DELETED, value);
	}

	/**
	 * 属性名称-供应商代码
	 */
	private static final String PROPERTY_SUPPLIERCODE_NAME = "SupplierCode";

	/**
	 * 供应商代码 属性
	 */
	@DbField(name = "CardCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_SUPPLIERCODE = registerProperty(PROPERTY_SUPPLIERCODE_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-供应商代码
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_SUPPLIERCODE_NAME)
	public final String getSupplierCode() {
		return this.getProperty(PROPERTY_SUPPLIERCODE);
	}

	/**
	 * 设置-供应商代码
	 * 
	 * @param value
	 *            值
	 */
	public final void setSupplierCode(String value) {
		this.setProperty(PROPERTY_SUPPLIERCODE, value);
	}

	/**
	 * 属性名称-供应商名称
	 */
	private static final String PROPERTY_SUPPLIERNAME_NAME = "SupplierName";

	/**
	 * 供应商名称 属性
	 */
	@DbField(name = "CardName", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_SUPPLIERNAME = registerProperty(PROPERTY_SUPPLIERNAME_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-供应商名称
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_SUPPLIERNAME_NAME)
	public final String getSupplierName() {
		return this.getProperty(PROPERTY_SUPPLIERNAME);
	}

	/**
	 * 设置-供应商名称
	 * 
	 * @param value
	 *            值
	 */
	public final void setSupplierName(String value) {
		this.setProperty(PROPERTY_SUPPLIERNAME, value);
	}

	/**
	 * 属性名称-联系人
	 */
	private static final String PROPERTY_CONTACTPERSON_NAME = "ContactPerson";

	/**
	 * 联系人 属性
	 */
	@DbField(name = "CntctCode", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_CONTACTPERSON = registerProperty(PROPERTY_CONTACTPERSON_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-联系人
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_CONTACTPERSON_NAME)
	public final Integer getContactPerson() {
		return this.getProperty(PROPERTY_CONTACTPERSON);
	}

	/**
	 * 设置-联系人
	 * 
	 * @param value
	 *            值
	 */
	public final void setContactPerson(Integer value) {
		this.setProperty(PROPERTY_CONTACTPERSON, value);
	}

	/**
	 * 属性名称-折扣
	 */
	private static final String PROPERTY_DISCOUNT_NAME = "Discount";

	/**
	 * 折扣 属性
	 */
	@DbField(name = "DiscPrcnt", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DISCOUNT = registerProperty(PROPERTY_DISCOUNT_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-折扣
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DISCOUNT_NAME)
	public final Decimal getDiscount() {
		return this.getProperty(PROPERTY_DISCOUNT);
	}

	/**
	 * 设置-折扣
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscount(Decimal value) {
		this.setProperty(PROPERTY_DISCOUNT, value);
	}

	/**
	 * 设置-折扣
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscount(String value) {
		this.setDiscount(new Decimal(value));
	}

	/**
	 * 设置-折扣
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscount(int value) {
		this.setDiscount(new Decimal(value));
	}

	/**
	 * 设置-折扣
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscount(double value) {
		this.setDiscount(new Decimal(value));
	}

	/**
	 * 属性名称-折扣后总计
	 */
	private static final String PROPERTY_DISCOUNTTOTAL_NAME = "DiscountTotal";

	/**
	 * 折扣后总计 属性
	 */
	@DbField(name = "DiscSum", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DISCOUNTTOTAL = registerProperty(PROPERTY_DISCOUNTTOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-折扣后总计
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DISCOUNTTOTAL_NAME)
	public final Decimal getDiscountTotal() {
		return this.getProperty(PROPERTY_DISCOUNTTOTAL);
	}

	/**
	 * 设置-折扣后总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscountTotal(Decimal value) {
		this.setProperty(PROPERTY_DISCOUNTTOTAL, value);
	}

	/**
	 * 设置-折扣后总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscountTotal(String value) {
		this.setDiscountTotal(new Decimal(value));
	}

	/**
	 * 设置-折扣后总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscountTotal(int value) {
		this.setDiscountTotal(new Decimal(value));
	}

	/**
	 * 设置-折扣后总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiscountTotal(double value) {
		this.setDiscountTotal(new Decimal(value));
	}

	/**
	 * 属性名称-单据货币
	 */
	private static final String PROPERTY_DOCUMENTCURRENCY_NAME = "DocumentCurrency";

	/**
	 * 单据货币 属性
	 */
	@DbField(name = "DocCur", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_DOCUMENTCURRENCY = registerProperty(
			PROPERTY_DOCUMENTCURRENCY_NAME, String.class, MY_CLASS);

	/**
	 * 获取-单据货币
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTCURRENCY_NAME)
	public final String getDocumentCurrency() {
		return this.getProperty(PROPERTY_DOCUMENTCURRENCY);
	}

	/**
	 * 设置-单据货币
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentCurrency(String value) {
		this.setProperty(PROPERTY_DOCUMENTCURRENCY, value);
	}

	/**
	 * 属性名称-单据汇率
	 */
	private static final String PROPERTY_DOCUMENTRATE_NAME = "DocumentRate";

	/**
	 * 单据汇率 属性
	 */
	@DbField(name = "DocRate", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DOCUMENTRATE = registerProperty(PROPERTY_DOCUMENTRATE_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-单据汇率
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTRATE_NAME)
	public final Decimal getDocumentRate() {
		return this.getProperty(PROPERTY_DOCUMENTRATE);
	}

	/**
	 * 设置-单据汇率
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentRate(Decimal value) {
		this.setProperty(PROPERTY_DOCUMENTRATE, value);
	}

	/**
	 * 设置-单据汇率
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentRate(String value) {
		this.setDocumentRate(new Decimal(value));
	}

	/**
	 * 设置-单据汇率
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentRate(int value) {
		this.setDocumentRate(new Decimal(value));
	}

	/**
	 * 设置-单据汇率
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentRate(double value) {
		this.setDocumentRate(new Decimal(value));
	}

	/**
	 * 属性名称-单据总计
	 */
	private static final String PROPERTY_DOCUMENTTOTAL_NAME = "DocumentTotal";

	/**
	 * 单据总计 属性
	 */
	@DbField(name = "DocTotal", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DOCUMENTTOTAL = registerProperty(PROPERTY_DOCUMENTTOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-单据总计
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DOCUMENTTOTAL_NAME)
	public final Decimal getDocumentTotal() {
		return this.getProperty(PROPERTY_DOCUMENTTOTAL);
	}

	/**
	 * 设置-单据总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentTotal(Decimal value) {
		this.setProperty(PROPERTY_DOCUMENTTOTAL, value);
	}

	/**
	 * 设置-单据总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentTotal(String value) {
		this.setDocumentTotal(new Decimal(value));
	}

	/**
	 * 设置-单据总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentTotal(int value) {
		this.setDocumentTotal(new Decimal(value));
	}

	/**
	 * 设置-单据总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setDocumentTotal(double value) {
		this.setDocumentTotal(new Decimal(value));
	}

	/**
	 * 属性名称-已付款总计
	 */
	private static final String PROPERTY_PAIDTOTAL_NAME = "PaidTotal";

	/**
	 * 已付款总计 属性
	 */
	@DbField(name = "PaidTotal", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_PAIDTOTAL = registerProperty(PROPERTY_PAIDTOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-已付款总计
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_PAIDTOTAL_NAME)
	public final Decimal getPaidTotal() {
		return this.getProperty(PROPERTY_PAIDTOTAL);
	}

	/**
	 * 设置-已付款总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setPaidTotal(Decimal value) {
		this.setProperty(PROPERTY_PAIDTOTAL, value);
	}

	/**
	 * 设置-已付款总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setPaidTotal(String value) {
		this.setPaidTotal(new Decimal(value));
	}

	/**
	 * 设置-已付款总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setPaidTotal(int value) {
		this.setPaidTotal(new Decimal(value));
	}

	/**
	 * 设置-已付款总计
	 * 
	 * @param value
	 *            值
	 */
	public final void setPaidTotal(double value) {
		this.setPaidTotal(new Decimal(value));
	}

	/**
	 * 属性名称-价格清单
	 */
	private static final String PROPERTY_PRICELIST_NAME = "PriceList";

	/**
	 * 价格清单 属性
	 */
	@DbField(name = "PriceList", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Integer> PROPERTY_PRICELIST = registerProperty(PROPERTY_PRICELIST_NAME,
			Integer.class, MY_CLASS);

	/**
	 * 获取-价格清单
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_PRICELIST_NAME)
	public final Integer getPriceList() {
		return this.getProperty(PROPERTY_PRICELIST);
	}

	/**
	 * 设置-价格清单
	 * 
	 * @param value
	 *            值
	 */
	public final void setPriceList(Integer value) {
		this.setProperty(PROPERTY_PRICELIST, value);
	}

	/**
	 * 属性名称-付款条款代码
	 */
	private static final String PROPERTY_PAYMENTCODE_NAME = "PaymentCode";

	/**
	 * 付款条款代码 属性
	 */
	@DbField(name = "PaymentCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_PAYMENTCODE = registerProperty(PROPERTY_PAYMENTCODE_NAME,
			String.class, MY_CLASS);

	/**
	 * 获取-付款条款代码
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_PAYMENTCODE_NAME)
	public final String getPaymentCode() {
		return this.getProperty(PROPERTY_PAYMENTCODE);
	}

	/**
	 * 设置-付款条款代码
	 * 
	 * @param value
	 *            值
	 */
	public final void setPaymentCode(String value) {
		this.setProperty(PROPERTY_PAYMENTCODE, value);
	}

	/**
	 * 属性名称-舍入
	 */
	private static final String PROPERTY_ROUNDING_NAME = "Rounding";

	/**
	 * 舍入 属性
	 */
	@DbField(name = "Rounding", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<emYesNo> PROPERTY_ROUNDING = registerProperty(PROPERTY_ROUNDING_NAME,
			emYesNo.class, MY_CLASS);

	/**
	 * 获取-舍入
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_ROUNDING_NAME)
	public final emYesNo getRounding() {
		return this.getProperty(PROPERTY_ROUNDING);
	}

	/**
	 * 设置-舍入
	 * 
	 * @param value
	 *            值
	 */
	public final void setRounding(emYesNo value) {
		this.setProperty(PROPERTY_ROUNDING, value);
	}

	/**
	 * 属性名称-舍入差额
	 */
	private static final String PROPERTY_DIFFAMOUNT_NAME = "DiffAmount";

	/**
	 * 舍入差额 属性
	 */
	@DbField(name = "RoundDiff", type = DbFieldType.DECIMAL, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<Decimal> PROPERTY_DIFFAMOUNT = registerProperty(PROPERTY_DIFFAMOUNT_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-舍入差额
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_DIFFAMOUNT_NAME)
	public final Decimal getDiffAmount() {
		return this.getProperty(PROPERTY_DIFFAMOUNT);
	}

	/**
	 * 设置-舍入差额
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiffAmount(Decimal value) {
		this.setProperty(PROPERTY_DIFFAMOUNT, value);
	}

	/**
	 * 设置-舍入差额
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiffAmount(String value) {
		this.setDiffAmount(new Decimal(value));
	}

	/**
	 * 设置-舍入差额
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiffAmount(int value) {
		this.setDiffAmount(new Decimal(value));
	}

	/**
	 * 设置-舍入差额
	 * 
	 * @param value
	 *            值
	 */
	public final void setDiffAmount(double value) {
		this.setDiffAmount(new Decimal(value));
	}

	/**
	 * 属性名称-项目代码
	 */
	private static final String PROPERTY_PROJECT_NAME = "Project";

	/**
	 * 项目代码 属性
	 */
	@DbField(name = "Project", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
	public static final IPropertyInfo<String> PROPERTY_PROJECT = registerProperty(PROPERTY_PROJECT_NAME, String.class,
			MY_CLASS);

	/**
	 * 获取-项目代码
	 * 
	 * @return 值
	 */
	@XmlElement(name = PROPERTY_PROJECT_NAME)
	public final String getProject() {
		return this.getProperty(PROPERTY_PROJECT);
	}

	/**
	 * 设置-项目代码
	 * 
	 * @param value
	 *            值
	 */
	public final void setProject(String value) {
		this.setProperty(PROPERTY_PROJECT, value);
	}

	/**
	 * 属性名称-采购收货-行
	 */
	private static final String PROPERTY_PURCHASEDELIVERYITEMS_NAME = "PurchaseDeliveryItems";

	/**
	 * 采购收货-行的集合属性
	 * 
	 */
	public static final IPropertyInfo<IPurchaseDeliveryItems> PROPERTY_PURCHASEDELIVERYITEMS = registerProperty(
			PROPERTY_PURCHASEDELIVERYITEMS_NAME, IPurchaseDeliveryItems.class, MY_CLASS);

	/**
	 * 获取-采购收货-行集合
	 * 
	 * @return 值
	 */
	@XmlElementWrapper(name = PROPERTY_PURCHASEDELIVERYITEMS_NAME)
	@XmlElement(name = PurchaseDeliveryItem.BUSINESS_OBJECT_NAME, type = PurchaseDeliveryItem.class)
	public final IPurchaseDeliveryItems getPurchaseDeliveryItems() {
		return this.getProperty(PROPERTY_PURCHASEDELIVERYITEMS);
	}

	/**
	 * 设置-采购收货-行集合
	 * 
	 * @param value
	 *            值
	 */
	public final void setPurchaseDeliveryItems(IPurchaseDeliveryItems value) {
		this.setProperty(PROPERTY_PURCHASEDELIVERYITEMS, value);
	}

	/**
	 * 属性名称-送货地址
	 */
	private static final String PROPERTY_SHIPPINGADDRESSS_NAME = "ShippingAddresss";

	/**
	 * 送货地址的集合属性
	 * 
	 */
	public static final IPropertyInfo<IShippingAddresss> PROPERTY_SHIPPINGADDRESSS = registerProperty(
			PROPERTY_SHIPPINGADDRESSS_NAME, IShippingAddresss.class, MY_CLASS);

	/**
	 * 获取-送货地址集合
	 * 
	 * @return 值
	 */
	@XmlElementWrapper(name = PROPERTY_SHIPPINGADDRESSS_NAME)
	@XmlElement(name = ShippingAddress.BUSINESS_OBJECT_NAME, type = ShippingAddress.class)
	public final IShippingAddresss getShippingAddresss() {
		return this.getProperty(PROPERTY_SHIPPINGADDRESSS);
	}

	/**
	 * 设置-送货地址集合
	 * 
	 * @param value
	 *            值
	 */
	public final void setShippingAddresss(IShippingAddresss value) {
		this.setProperty(PROPERTY_SHIPPINGADDRESSS, value);
	}

	/**
	 * 初始化数据
	 */
	@Override
	protected void initialize() {
		super.initialize();// 基类初始化，不可去除
		this.setPurchaseDeliveryItems(new PurchaseDeliveryItems(this));
		this.setShippingAddresss(new ShippingAddresss(this));
		this.setObjectCode(MyConfiguration.applyVariables(BUSINESS_OBJECT_CODE));
		this.setPostingDate(DateTime.getToday());
		this.setDocumentDate(DateTime.getToday());
		this.setDeliveryDate(DateTime.getToday());
		this.setDocumentStatus(emDocumentStatus.RELEASED);
		this.setDiscount(Decimal.ONE);
	}

	/**
	 * 属性名称-项目的行总计
	 */
	private static final String PROPERTY_ITEMSLINETOTAL_NAME = "ItemsLineTotal";

	/**
	 * 项目的行总计 属性
	 */
	public static final IPropertyInfo<Decimal> PROPERTY_ITEMSLINETOTAL = registerProperty(PROPERTY_ITEMSLINETOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-项目的行总计
	 * 
	 * @return 值
	 */
	public final Decimal getItemsLineTotal() {
		return this.getProperty(PROPERTY_ITEMSLINETOTAL);
	}

	/**
	 * 设置-项目的行总计
	 * 
	 * @param value
	 *            值
	 */
	final void setItemsLineTotal(Decimal value) {
		this.setProperty(PROPERTY_ITEMSLINETOTAL, value);
	}

	/**
	 * 属性名称-项目的税总计
	 */
	private static final String PROPERTY_ITEMSTAXTOTAL_NAME = "ItemsTaxTotal";

	/**
	 * 项目的税总计 属性
	 */
	public static final IPropertyInfo<Decimal> PROPERTY_ITEMSTAXTOTAL = registerProperty(PROPERTY_ITEMSTAXTOTAL_NAME,
			Decimal.class, MY_CLASS);

	/**
	 * 获取-项目的税总计
	 * 
	 * @return 值
	 */
	public final Decimal getItemsTaxTotal() {
		return this.getProperty(PROPERTY_ITEMSTAXTOTAL);
	}

	/**
	 * 设置-项目的税总计
	 * 
	 * @param value
	 *            值
	 */
	final void setItemsTaxTotal(Decimal value) {
		this.setProperty(PROPERTY_ITEMSTAXTOTAL, value);
	}

	/**
	 * 属性名称-运送费用总计
	 */
	private static final String PROPERTY_SHIPPINGSEXPENSETOTAL_NAME = "ShippingsExpenseTotal";

	/**
	 * 运送费用总计 属性
	 */
	public static final IPropertyInfo<Decimal> PROPERTY_SHIPPINGSEXPENSETOTAL = registerProperty(
			PROPERTY_SHIPPINGSEXPENSETOTAL_NAME, Decimal.class, MY_CLASS);

	/**
	 * 获取-运送费用总计
	 * 
	 * @return 值
	 */
	public final Decimal getShippingsExpenseTotal() {
		return this.getProperty(PROPERTY_SHIPPINGSEXPENSETOTAL);
	}

	/**
	 * 设置-运送费用总计
	 * 
	 * @param value
	 *            值
	 */
	final void setShippingsExpenseTotal(Decimal value) {
		this.setProperty(PROPERTY_SHIPPINGSEXPENSETOTAL, value);
	}

	@Override
	protected IBusinessRule[] registerRules() {
		return new IBusinessRule[] { // 注册的业务规则
				new BusinessRuleRequired(PROPERTY_SUPPLIERCODE), // 要求有值
				new BusinessRuleMinValue<Decimal>(Decimal.ZERO, PROPERTY_DISCOUNT), // 不能低于0
				new BusinessRuleMinValue<Decimal>(Decimal.ZERO, PROPERTY_DOCUMENTRATE), // 不能低于0
				new BusinessRuleRequiredElements(PROPERTY_PURCHASEDELIVERYITEMS), // 要求有元素
				new BusinessRuleSumElements(PROPERTY_ITEMSLINETOTAL, PROPERTY_PURCHASEDELIVERYITEMS,
						PurchaseDeliveryItem.PROPERTY_LINETOTAL), // 计算项目-行总计
				new BusinessRuleSumElements(PROPERTY_ITEMSTAXTOTAL, PROPERTY_PURCHASEDELIVERYITEMS,
						PurchaseDeliveryItem.PROPERTY_TAXTOTAL), // 计算项目-税总计
				new BusinessRuleSumElements(PROPERTY_SHIPPINGSEXPENSETOTAL, PROPERTY_SHIPPINGADDRESSS,
						ShippingAddress.PROPERTY_EXPENSE), // 计算运输-费用总计
				// 折扣后总计 = 项目-行总计 * 折扣
				new BusinessRuleMultiplication(PROPERTY_DISCOUNTTOTAL, PROPERTY_ITEMSLINETOTAL, PROPERTY_DISCOUNT),
				// 单据总计 = 折扣后总计 + 运输费用 + 税总额
				new BusinessRuleSummation(PROPERTY_DOCUMENTTOTAL, PROPERTY_DISCOUNTTOTAL, PROPERTY_ITEMSTAXTOTAL,
						PROPERTY_SHIPPINGSEXPENSETOTAL),
				new BusinessRuleMinValue<Decimal>(Decimal.ZERO, PROPERTY_DISCOUNTTOTAL), // 不能低于0
				new BusinessRuleMinValue<Decimal>(Decimal.ZERO, PROPERTY_DOCUMENTTOTAL), // 不能低于0

		};
	}
}
