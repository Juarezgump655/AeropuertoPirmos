package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvionRepo extends CrudRepository<Avion, Long> {

    @Query(value = "SELECT * FROM avion\n" +
        "   WHERE idestado=1", nativeQuery= true)
    List<Avion>  findAll();


    @Query(value="SELECT * FROM avion\n" +
            "WHERE idaerolinea=:id\n" +
            "AND idestado=1   ORDER BY asiento ASC", nativeQuery = true)
    List<Avion>  findByAerolinea(@Param("id") Long id);

    @Query(value="SELECT * FROM avion\n" +
            "WHERE idaerolinea=:id", nativeQuery = true)
    List<Avion>  findByAerolineaT(@Param("id") Long id);


    @Query(value ="UPDATE public.avion\n" +
            "set idestado= 3, usuariomodi=:iduser\n" +
            "WHERE idavion= :id", nativeQuery = true)
    void cambiarEstado(@Param("iduser") Long iduser,@Param("id") Long id);



    @Query(value ="  UPDATE public.avion\n" +
            "          set idestado= 5,  usuariomodi=:iduser\n" +
            "          WHERE idavion=:id ", nativeQuery = true)
    void eliminadologico(@Param("iduser") Long iduser,@Param("id") Long id);




}
