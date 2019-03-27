/*
 * Copyright 2017 SNOMED International, http://snomed.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snomed.otf.owltoolkit.domain;

import org.semanticweb.owlapi.vocab.OWL2Datatype;

public class DatatypeProperty {

    private String uuid;
	private int effectiveTime;
	private final long moduleId;
	private final long typeId;
	private final long destinationId;
	private int group;
    private String value;
    private OWL2Datatype datatype;

    public DatatypeProperty(String uuid, int effectiveTime, long moduleId, long typeId, long destinationId, int group, String value,
            OWL2Datatype datatype) {
        super();
        this.uuid = uuid;
        this.effectiveTime = effectiveTime;
        this.moduleId = moduleId;
        this.typeId = typeId;
        this.destinationId = destinationId;
        this.group = group;
        this.value = value;
        this.datatype = datatype;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(int effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public long getModuleId() {
        return moduleId;
    }

    public long getTypeId() {
        return typeId;
    }

    public long getDestinationId() {
        return destinationId;
    }

    public OWL2Datatype getDatatype() {
        return datatype;
    }

    public void setDatatype(OWL2Datatype datatype) {
        this.datatype = datatype;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((datatype == null) ? 0 : datatype.hashCode());
        result = prime * result + (int) (destinationId ^ (destinationId >>> 32));
        result = prime * result + effectiveTime;
        result = prime * result + group;
        result = prime * result + (int) (moduleId ^ (moduleId >>> 32));
        result = prime * result + (int) (typeId ^ (typeId >>> 32));
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DatatypeProperty other = (DatatypeProperty) obj;
        if (datatype != other.datatype)
            return false;
        if (destinationId != other.destinationId)
            return false;
        if (effectiveTime != other.effectiveTime)
            return false;
        if (group != other.group)
            return false;
        if (moduleId != other.moduleId)
            return false;
        if (typeId != other.typeId)
            return false;
        if (uuid == null) {
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
