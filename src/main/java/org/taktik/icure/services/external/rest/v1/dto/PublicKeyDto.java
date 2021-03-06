/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.taktik.icure.services.external.rest.v1.dto;

import java.io.Serializable;

public class PublicKeyDto implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	String hcPartyId;
	String hexString;


	public PublicKeyDto() {
	}

	public PublicKeyDto(String hcPartyId, String hexString) {
		this.hcPartyId = hcPartyId;
		this.hexString = hexString;
	}

	public String getHcPartyId() {
		return hcPartyId;
	}

	public void setHcPartyId(String hcPartyId) {
		this.hcPartyId = hcPartyId;
	}

	public String getHexString() {
		return hexString;
	}

	public void setHexString(String hexString) {
		this.hexString = hexString;
	}
}
