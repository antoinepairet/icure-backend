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

package org.taktik.icure.be.ehealth.dto.civics;

import java.util.Date;

import org.taktik.icure.be.ehealth.dto.civics.*;
import org.taktik.icure.be.ehealth.dto.civics.Vtm;

public class VtmIngredient {

	org.taktik.icure.be.ehealth.dto.civics.Substance cas;
	org.taktik.icure.be.ehealth.dto.civics.Vtm vtm;

	Date startDate;
	Date createdTms;
	String createdUserId;
	Date endDate;
	Long rank;
	String modificationStatus;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public org.taktik.icure.be.ehealth.dto.civics.Substance getCas() {
        return cas;
    }

    public void setCas(org.taktik.icure.be.ehealth.dto.civics.Substance cas) {
        this.cas = cas;
    }

    public org.taktik.icure.be.ehealth.dto.civics.Vtm getVtm() {
        return vtm;
    }

    public void setVtm(Vtm vtm) {
        this.vtm = vtm;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCreatedTms() {
        return createdTms;
    }

    public void setCreatedTms(Date createdTms) {
        this.createdTms = createdTms;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getModificationStatus() {
        return modificationStatus;
    }

    public void setModificationStatus(String modificationStatus) {
        this.modificationStatus = modificationStatus;
    }
}

