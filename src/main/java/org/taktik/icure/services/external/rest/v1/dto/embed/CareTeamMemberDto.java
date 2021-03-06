package org.taktik.icure.services.external.rest.v1.dto.embed;

import org.taktik.icure.entities.base.CodeStub;
import org.taktik.icure.entities.embed.CareTeamMemberType;

import java.io.Serializable;
import java.util.Objects;

public class CareTeamMemberDto implements Serializable {
    private String id;
    private CareTeamMemberType careTeamMemberType;
    private String healthcarePartyId;
    private CodeStub quality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CareTeamMemberDto that = (CareTeamMemberDto) o;
        return Objects.equals(id, that.id) &&
                careTeamMemberType == that.careTeamMemberType &&
                Objects.equals(healthcarePartyId, that.healthcarePartyId) &&
                Objects.equals(quality, that.quality);
    }

    @Override
    public int hashCode() { return Objects.hash(id, careTeamMemberType, healthcarePartyId, quality); }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public CareTeamMemberType getCareTeamMemberType() { return careTeamMemberType; }

    public void setCareTeamMemberType(CareTeamMemberType careTeamMemberType) { this.careTeamMemberType = careTeamMemberType; }

    public String getHealthcarePartyId() { return healthcarePartyId; }

    public void setHealthcarePartyId(String healthcarePartyId) { this.healthcarePartyId = healthcarePartyId; }

    public CodeStub getQuality() { return quality; }

    public void setQuality(CodeStub quality) { this.quality = quality; }
}
