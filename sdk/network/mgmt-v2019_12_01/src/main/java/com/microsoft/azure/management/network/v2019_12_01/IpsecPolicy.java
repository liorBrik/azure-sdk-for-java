/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An IPSec Policy configuration for a virtual network gateway connection.
 */
public class IpsecPolicy {
    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * lifetime in seconds for a site to site VPN tunnel.
     */
    @JsonProperty(value = "saLifeTimeSeconds", required = true)
    private int saLifeTimeSeconds;

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA)
     * payload size in KB for a site to site VPN tunnel.
     */
    @JsonProperty(value = "saDataSizeKilobytes", required = true)
    private int saDataSizeKilobytes;

    /**
     * The IPSec encryption algorithm (IKE phase 1). Possible values include:
     * 'None', 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES128',
     * 'GCMAES192', 'GCMAES256'.
     */
    @JsonProperty(value = "ipsecEncryption", required = true)
    private IpsecEncryption ipsecEncryption;

    /**
     * The IPSec integrity algorithm (IKE phase 1). Possible values include:
     * 'MD5', 'SHA1', 'SHA256', 'GCMAES128', 'GCMAES192', 'GCMAES256'.
     */
    @JsonProperty(value = "ipsecIntegrity", required = true)
    private IpsecIntegrity ipsecIntegrity;

    /**
     * The IKE encryption algorithm (IKE phase 2). Possible values include:
     * 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES256', 'GCMAES128'.
     */
    @JsonProperty(value = "ikeEncryption", required = true)
    private IkeEncryption ikeEncryption;

    /**
     * The IKE integrity algorithm (IKE phase 2). Possible values include:
     * 'MD5', 'SHA1', 'SHA256', 'SHA384', 'GCMAES256', 'GCMAES128'.
     */
    @JsonProperty(value = "ikeIntegrity", required = true)
    private IkeIntegrity ikeIntegrity;

    /**
     * The DH Group used in IKE Phase 1 for initial SA. Possible values
     * include: 'None', 'DHGroup1', 'DHGroup2', 'DHGroup14', 'DHGroup2048',
     * 'ECP256', 'ECP384', 'DHGroup24'.
     */
    @JsonProperty(value = "dhGroup", required = true)
    private DhGroup dhGroup;

    /**
     * The Pfs Group used in IKE Phase 2 for new child SA. Possible values
     * include: 'None', 'PFS1', 'PFS2', 'PFS2048', 'ECP256', 'ECP384', 'PFS24',
     * 'PFS14', 'PFSMM'.
     */
    @JsonProperty(value = "pfsGroup", required = true)
    private PfsGroup pfsGroup;

    /**
     * Get the IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for a site to site VPN tunnel.
     *
     * @return the saLifeTimeSeconds value
     */
    public int saLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    /**
     * Set the IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for a site to site VPN tunnel.
     *
     * @param saLifeTimeSeconds the saLifeTimeSeconds value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaLifeTimeSeconds(int saLifeTimeSeconds) {
        this.saLifeTimeSeconds = saLifeTimeSeconds;
        return this;
    }

    /**
     * Get the IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for a site to site VPN tunnel.
     *
     * @return the saDataSizeKilobytes value
     */
    public int saDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * Set the IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for a site to site VPN tunnel.
     *
     * @param saDataSizeKilobytes the saDataSizeKilobytes value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withSaDataSizeKilobytes(int saDataSizeKilobytes) {
        this.saDataSizeKilobytes = saDataSizeKilobytes;
        return this;
    }

    /**
     * Get the IPSec encryption algorithm (IKE phase 1). Possible values include: 'None', 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES128', 'GCMAES192', 'GCMAES256'.
     *
     * @return the ipsecEncryption value
     */
    public IpsecEncryption ipsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * Set the IPSec encryption algorithm (IKE phase 1). Possible values include: 'None', 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES128', 'GCMAES192', 'GCMAES256'.
     *
     * @param ipsecEncryption the ipsecEncryption value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecEncryption(IpsecEncryption ipsecEncryption) {
        this.ipsecEncryption = ipsecEncryption;
        return this;
    }

    /**
     * Get the IPSec integrity algorithm (IKE phase 1). Possible values include: 'MD5', 'SHA1', 'SHA256', 'GCMAES128', 'GCMAES192', 'GCMAES256'.
     *
     * @return the ipsecIntegrity value
     */
    public IpsecIntegrity ipsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * Set the IPSec integrity algorithm (IKE phase 1). Possible values include: 'MD5', 'SHA1', 'SHA256', 'GCMAES128', 'GCMAES192', 'GCMAES256'.
     *
     * @param ipsecIntegrity the ipsecIntegrity value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIpsecIntegrity(IpsecIntegrity ipsecIntegrity) {
        this.ipsecIntegrity = ipsecIntegrity;
        return this;
    }

    /**
     * Get the IKE encryption algorithm (IKE phase 2). Possible values include: 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES256', 'GCMAES128'.
     *
     * @return the ikeEncryption value
     */
    public IkeEncryption ikeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * Set the IKE encryption algorithm (IKE phase 2). Possible values include: 'DES', 'DES3', 'AES128', 'AES192', 'AES256', 'GCMAES256', 'GCMAES128'.
     *
     * @param ikeEncryption the ikeEncryption value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeEncryption(IkeEncryption ikeEncryption) {
        this.ikeEncryption = ikeEncryption;
        return this;
    }

    /**
     * Get the IKE integrity algorithm (IKE phase 2). Possible values include: 'MD5', 'SHA1', 'SHA256', 'SHA384', 'GCMAES256', 'GCMAES128'.
     *
     * @return the ikeIntegrity value
     */
    public IkeIntegrity ikeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * Set the IKE integrity algorithm (IKE phase 2). Possible values include: 'MD5', 'SHA1', 'SHA256', 'SHA384', 'GCMAES256', 'GCMAES128'.
     *
     * @param ikeIntegrity the ikeIntegrity value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withIkeIntegrity(IkeIntegrity ikeIntegrity) {
        this.ikeIntegrity = ikeIntegrity;
        return this;
    }

    /**
     * Get the DH Group used in IKE Phase 1 for initial SA. Possible values include: 'None', 'DHGroup1', 'DHGroup2', 'DHGroup14', 'DHGroup2048', 'ECP256', 'ECP384', 'DHGroup24'.
     *
     * @return the dhGroup value
     */
    public DhGroup dhGroup() {
        return this.dhGroup;
    }

    /**
     * Set the DH Group used in IKE Phase 1 for initial SA. Possible values include: 'None', 'DHGroup1', 'DHGroup2', 'DHGroup14', 'DHGroup2048', 'ECP256', 'ECP384', 'DHGroup24'.
     *
     * @param dhGroup the dhGroup value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withDhGroup(DhGroup dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * Get the Pfs Group used in IKE Phase 2 for new child SA. Possible values include: 'None', 'PFS1', 'PFS2', 'PFS2048', 'ECP256', 'ECP384', 'PFS24', 'PFS14', 'PFSMM'.
     *
     * @return the pfsGroup value
     */
    public PfsGroup pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * Set the Pfs Group used in IKE Phase 2 for new child SA. Possible values include: 'None', 'PFS1', 'PFS2', 'PFS2048', 'ECP256', 'ECP384', 'PFS24', 'PFS14', 'PFSMM'.
     *
     * @param pfsGroup the pfsGroup value to set
     * @return the IpsecPolicy object itself.
     */
    public IpsecPolicy withPfsGroup(PfsGroup pfsGroup) {
        this.pfsGroup = pfsGroup;
        return this;
    }

}
