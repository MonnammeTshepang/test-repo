package cdc.dddg.dbt.model;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Map;


@Mapper(componentModel = "cdi")
public interface DbtMapper {


    //----------- TDBDDP -----------------
    @Mapping(source = "timestamp", target = "timestamp", dateFormat = "yyyy-MM-dd HH.mm.ss.SSSSSS")
    Tdbddp mapToTdbddp(Map<String, String> srcMap);


    //----------- TDBDDC -----------------
    @Mapping(source = "timestamp", target = "timestamp", dateFormat = "yyyy-MM-dd HH.mm.ss.SSSSSS")
    @Mapping(target = "tdbddcPK", ignore = true)
    Tdbddc mapToTdbddc(Map<String, String> srcMap);

    @AfterMapping
    default void setTdbddcId(@MappingTarget Tdbddc tdbddc, Map<String, String> map) {
        tdbddc.setTdbddcPK(mapTdbddcPK(map));
    }

    TdbddcPK mapTdbddcPK(Map<String, String> map);

    //------------------ -----------------

}
