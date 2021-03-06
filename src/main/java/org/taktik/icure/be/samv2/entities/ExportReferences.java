//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.05.22 at 08:11:32 PM CEST
//


package org.taktik.icure.be.samv2.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.AppendixType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.AtcClassificationType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.DeliveryModusSpecificationType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.DeliveryModusType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.DeviceTypeType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.FormCategoryType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.NoGenericPrescriptionReasonType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.NoSwitchReasonType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.PackagingClosureType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.PackagingMaterialType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.PackagingTypeType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.ParameterType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.PharmaceuticalFormType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.ReimbursementCriterionType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.RouteOfAdministrationType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.StandardFormCommonType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.StandardRouteCommonType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.StandardSubstanceCommonType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.StandardUnitFamhpType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.SubstanceType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.VirtualFormType;
import org.taktik.icure.be.ehealth.samws.v2.refdata.WadaType;


/**
 * <p>Java class for ExportReferencesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportReferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:samws:v2:export}VersionedExportType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:refdata}SetFamhpMainEntities"/>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:refdata}SetBcpiMainEntities"/>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:refdata}CommonAdditionalEntities"/>
 *         &lt;group ref="{urn:be:fgov:ehealth:samws:v2:refdata}SetNihdiEntities"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportReferencesType", propOrder = {
    "atcClassifications",
    "deliveryModuses",
    "deliveryModusSpecifications",
    "deviceTypes",
    "packagingClosures",
    "packagingMaterials",
    "packagingTypes",
    "pharmaceuticalForms",
    "routeOfAdministrations",
    "substances",
    "noSwitchReasons",
    "virtualForms",
    "wadas",
    "noGenericPrescriptionReasons",
    "standardForms",
    "standardRoutes",
    "standardSubstances",
    "standardUnits",
    "appendixes",
    "formCategories",
    "parameters",
    "reimbursementCriterions"
})
@XmlRootElement(name = "ExportReferences")
public class ExportReferences
    extends VersionedExportType
    implements Serializable
{

    private final static long serialVersionUID = 2L;
    @XmlElement(name = "AtcClassification", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<AtcClassificationType> atcClassifications;
    @XmlElement(name = "DeliveryModus", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<DeliveryModusType> deliveryModuses;
    @XmlElement(name = "DeliveryModusSpecification", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<DeliveryModusSpecificationType> deliveryModusSpecifications;
    @XmlElement(name = "DeviceType", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<DeviceTypeType> deviceTypes;
    @XmlElement(name = "PackagingClosure", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<PackagingClosureType> packagingClosures;
    @XmlElement(name = "PackagingMaterial", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<PackagingMaterialType> packagingMaterials;
    @XmlElement(name = "PackagingType", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<PackagingTypeType> packagingTypes;
    @XmlElement(name = "PharmaceuticalForm", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<PharmaceuticalFormType> pharmaceuticalForms;
    @XmlElement(name = "RouteOfAdministration", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<RouteOfAdministrationType> routeOfAdministrations;
    @XmlElement(name = "Substance", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<SubstanceType> substances;
    @XmlElement(name = "NoSwitchReason", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<NoSwitchReasonType> noSwitchReasons;
    @XmlElement(name = "VirtualForm", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<VirtualFormType> virtualForms;
    @XmlElement(name = "Wada", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<WadaType> wadas;
    @XmlElement(name = "NoGenericPrescriptionReason", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<NoGenericPrescriptionReasonType> noGenericPrescriptionReasons;
    @XmlElement(name = "StandardForm", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<StandardFormCommonType> standardForms;
    @XmlElement(name = "StandardRoute", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<StandardRouteCommonType> standardRoutes;
    @XmlElement(name = "StandardSubstance", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<StandardSubstanceCommonType> standardSubstances;
    @XmlElement(name = "StandardUnit", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<StandardUnitFamhpType> standardUnits;
    @XmlElement(name = "Appendix", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<AppendixType> appendixes;
    @XmlElement(name = "FormCategory", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<FormCategoryType> formCategories;
    @XmlElement(name = "Parameter", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<ParameterType> parameters;
    @XmlElement(name = "ReimbursementCriterion", namespace = "urn:be:fgov:ehealth:samws:v2:refdata")
    protected List<ReimbursementCriterionType> reimbursementCriterions;

    /**
     * Gets the value of the atcClassifications property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atcClassifications property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtcClassifications().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtcClassificationType }
     *
     *
     */
    public List<AtcClassificationType> getAtcClassifications() {
        if (atcClassifications == null) {
            atcClassifications = new ArrayList<AtcClassificationType>();
        }
        return this.atcClassifications;
    }

    /**
     * Gets the value of the deliveryModuses property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryModuses property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryModuses().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryModusType }
     *
     *
     */
    public List<DeliveryModusType> getDeliveryModuses() {
        if (deliveryModuses == null) {
            deliveryModuses = new ArrayList<DeliveryModusType>();
        }
        return this.deliveryModuses;
    }

    /**
     * Gets the value of the deliveryModusSpecifications property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryModusSpecifications property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryModusSpecifications().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryModusSpecificationType }
     *
     *
     */
    public List<DeliveryModusSpecificationType> getDeliveryModusSpecifications() {
        if (deliveryModusSpecifications == null) {
            deliveryModusSpecifications = new ArrayList<DeliveryModusSpecificationType>();
        }
        return this.deliveryModusSpecifications;
    }

    /**
     * Gets the value of the deviceTypes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceTypes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceTypeType }
     *
     *
     */
    public List<DeviceTypeType> getDeviceTypes() {
        if (deviceTypes == null) {
            deviceTypes = new ArrayList<DeviceTypeType>();
        }
        return this.deviceTypes;
    }

    /**
     * Gets the value of the packagingClosures property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingClosures property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingClosures().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingClosureType }
     *
     *
     */
    public List<PackagingClosureType> getPackagingClosures() {
        if (packagingClosures == null) {
            packagingClosures = new ArrayList<PackagingClosureType>();
        }
        return this.packagingClosures;
    }

    /**
     * Gets the value of the packagingMaterials property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingMaterials property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingMaterials().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingMaterialType }
     *
     *
     */
    public List<PackagingMaterialType> getPackagingMaterials() {
        if (packagingMaterials == null) {
            packagingMaterials = new ArrayList<PackagingMaterialType>();
        }
        return this.packagingMaterials;
    }

    /**
     * Gets the value of the packagingTypes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingTypes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingTypes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingTypeType }
     *
     *
     */
    public List<PackagingTypeType> getPackagingTypes() {
        if (packagingTypes == null) {
            packagingTypes = new ArrayList<PackagingTypeType>();
        }
        return this.packagingTypes;
    }

    /**
     * Gets the value of the pharmaceuticalForms property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmaceuticalForms property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmaceuticalForms().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PharmaceuticalFormType }
     *
     *
     */
    public List<PharmaceuticalFormType> getPharmaceuticalForms() {
        if (pharmaceuticalForms == null) {
            pharmaceuticalForms = new ArrayList<PharmaceuticalFormType>();
        }
        return this.pharmaceuticalForms;
    }

    /**
     * Gets the value of the routeOfAdministrations property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOfAdministrations property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOfAdministrations().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteOfAdministrationType }
     *
     *
     */
    public List<RouteOfAdministrationType> getRouteOfAdministrations() {
        if (routeOfAdministrations == null) {
            routeOfAdministrations = new ArrayList<RouteOfAdministrationType>();
        }
        return this.routeOfAdministrations;
    }

    /**
     * Gets the value of the substances property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substances property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstances().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstanceType }
     *
     *
     */
    public List<SubstanceType> getSubstances() {
        if (substances == null) {
            substances = new ArrayList<SubstanceType>();
        }
        return this.substances;
    }

    /**
     * Gets the value of the noSwitchReasons property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noSwitchReasons property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoSwitchReasons().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoSwitchReasonType }
     *
     *
     */
    public List<NoSwitchReasonType> getNoSwitchReasons() {
        if (noSwitchReasons == null) {
            noSwitchReasons = new ArrayList<NoSwitchReasonType>();
        }
        return this.noSwitchReasons;
    }

    /**
     * Gets the value of the virtualForms property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualForms property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVirtualForms().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualFormType }
     *
     *
     */
    public List<VirtualFormType> getVirtualForms() {
        if (virtualForms == null) {
            virtualForms = new ArrayList<VirtualFormType>();
        }
        return this.virtualForms;
    }

    /**
     * Gets the value of the wadas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wadas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWadas().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WadaType }
     *
     *
     */
    public List<WadaType> getWadas() {
        if (wadas == null) {
            wadas = new ArrayList<WadaType>();
        }
        return this.wadas;
    }

    /**
     * Gets the value of the noGenericPrescriptionReasons property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noGenericPrescriptionReasons property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoGenericPrescriptionReasons().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoGenericPrescriptionReasonType }
     *
     *
     */
    public List<NoGenericPrescriptionReasonType> getNoGenericPrescriptionReasons() {
        if (noGenericPrescriptionReasons == null) {
            noGenericPrescriptionReasons = new ArrayList<NoGenericPrescriptionReasonType>();
        }
        return this.noGenericPrescriptionReasons;
    }

    /**
     * Gets the value of the standardForms property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardForms property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardForms().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardFormCommonType }
     *
     *
     */
    public List<StandardFormCommonType> getStandardForms() {
        if (standardForms == null) {
            standardForms = new ArrayList<StandardFormCommonType>();
        }
        return this.standardForms;
    }

    /**
     * Gets the value of the standardRoutes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardRoutes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardRoutes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardRouteCommonType }
     *
     *
     */
    public List<StandardRouteCommonType> getStandardRoutes() {
        if (standardRoutes == null) {
            standardRoutes = new ArrayList<StandardRouteCommonType>();
        }
        return this.standardRoutes;
    }

    /**
     * Gets the value of the standardSubstances property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardSubstances property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardSubstances().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardSubstanceCommonType }
     *
     *
     */
    public List<StandardSubstanceCommonType> getStandardSubstances() {
        if (standardSubstances == null) {
            standardSubstances = new ArrayList<StandardSubstanceCommonType>();
        }
        return this.standardSubstances;
    }

    /**
     * Gets the value of the standardUnits property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardUnits property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardUnits().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardUnitFamhpType }
     *
     *
     */
    public List<StandardUnitFamhpType> getStandardUnits() {
        if (standardUnits == null) {
            standardUnits = new ArrayList<StandardUnitFamhpType>();
        }
        return this.standardUnits;
    }

    /**
     * Gets the value of the appendixes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendixes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendixes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendixType }
     *
     *
     */
    public List<AppendixType> getAppendixes() {
        if (appendixes == null) {
            appendixes = new ArrayList<AppendixType>();
        }
        return this.appendixes;
    }

    /**
     * Gets the value of the formCategories property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formCategories property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormCategories().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormCategoryType }
     *
     *
     */
    public List<FormCategoryType> getFormCategories() {
        if (formCategories == null) {
            formCategories = new ArrayList<FormCategoryType>();
        }
        return this.formCategories;
    }

    /**
     * Gets the value of the parameters property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     *
     *
     */
    public List<ParameterType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<ParameterType>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the reimbursementCriterions property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reimbursementCriterions property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReimbursementCriterions().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReimbursementCriterionType }
     *
     *
     */
    public List<ReimbursementCriterionType> getReimbursementCriterions() {
        if (reimbursementCriterions == null) {
            reimbursementCriterions = new ArrayList<ReimbursementCriterionType>();
        }
        return this.reimbursementCriterions;
    }

}
