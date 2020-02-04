package com.infosys.lbs.service.mapper;

import com.infosys.lbs.domain.*;
import com.infosys.lbs.service.dto.GeoFenceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link GeoFence} and its DTO {@link GeoFenceDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface GeoFenceMapper extends EntityMapper<GeoFenceDTO, GeoFence> {



    default GeoFence fromId(Long id) {
        if (id == null) {
            return null;
        }
        GeoFence geoFence = new GeoFence();
        geoFence.setId(id);
        return geoFence;
    }
}
