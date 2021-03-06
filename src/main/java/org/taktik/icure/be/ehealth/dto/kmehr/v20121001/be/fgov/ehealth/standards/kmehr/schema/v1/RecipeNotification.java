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

package org.taktik.icure.be.ehealth.dto.kmehr.v20121001.be.fgov.ehealth.standards.kmehr.schema.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationType", propOrder = {"text", "kmehrmessage"})
@XmlRootElement(name = "notification")
public class RecipeNotification {
	@XmlSchemaType(name = "text")
	String text;
	@XmlSchemaType(name = "kmehrmessage")
	Kmehrmessage kmehrmessage;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Kmehrmessage getKmehrmessage() {
		return kmehrmessage;
	}

	public void setKmehrmessage(Kmehrmessage kmehrmessage) {
		this.kmehrmessage = kmehrmessage;
	}
}
