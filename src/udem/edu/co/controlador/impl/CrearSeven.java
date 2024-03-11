package udem.edu.co.controlador.impl;

import udem.edu.co.modelo.impl.Habilidad;
import udem.edu.co.modelo.impl.Seven;

import java.util.ArrayList;
import java.util.List;

public class CrearSeven {
    public static List<Seven> crearSeven(){
        List<Seven> sevens = new ArrayList<>();

        Seven seven1 = new Seven();
        seven1.setNombre("Stormfront");
        List<Habilidad> habilidadStormfront = new ArrayList<>();
        habilidadStormfront.add(CrearHabilidades.crearHabilidadDeManipulacionDeEnergia());
        seven1.setHabilidades(habilidadStormfront);
        sevens.add(seven1);

        Seven seven2 = new Seven();
        seven2.setNombre("Starlight");
        List<Habilidad> habilidadStarlight = new ArrayList<>();
        habilidadStarlight.add(CrearHabilidades.crearHabilidadDeManipulacionDeEnergia());
        habilidadStarlight.add(CrearHabilidades.crearHabilidadDeVolador());
        seven2.setHabilidades(habilidadStarlight);
        sevens.add(seven2);

        Seven seven3 = new Seven();
        seven3.setNombre("Homelander");
        List<Habilidad> habilidadHomelander = new ArrayList<>();
        habilidadHomelander.add(CrearHabilidades.crearHabilidadDeFuerza());
        habilidadHomelander.add(CrearHabilidades.crearHabilidadDeInmortal());
        habilidadHomelander.add(CrearHabilidades.crearHabilidadDeVolador());
        seven3.setHabilidades(habilidadHomelander);
        sevens.add(seven3);

        Seven seven4 = new Seven();
        seven4.setNombre("Queen Maeve");
        List<Habilidad> habilidadQueenMaeve = new ArrayList<>();
        habilidadQueenMaeve.add(CrearHabilidades.crearHabilidadDeFuerza());
        habilidadQueenMaeve.add(CrearHabilidades.crearHabilidadDeInmortal());
        seven4.setHabilidades(habilidadQueenMaeve);
        sevens.add(seven4);

        Seven seven5 = new Seven();
        seven5.setNombre("Black Noir");
        List<Habilidad> habilidadBlackNoir = new ArrayList<>();
        habilidadBlackNoir.add(CrearHabilidades.crearHabilidadDeFuerza());
        habilidadBlackNoir.add(CrearHabilidades.crearHabilidadDeInmortal());
        seven5.setHabilidades(habilidadBlackNoir);
        sevens.add(seven5);

        Seven seven6 = new Seven();
        seven6.setNombre("A-Train");
        List<Habilidad> habilidadATrain = new ArrayList<>();
        habilidadATrain.add(CrearHabilidades.crearHabilidadDeFuerza());
        habilidadATrain.add(CrearHabilidades.crearHabilidadDeVelocidad());
        seven6.setHabilidades(habilidadATrain);
        sevens.add(seven6);

        Seven seven7 = new Seven();
        seven7.setNombre("The Deep");
        List<Habilidad> habilidadTheDeep= new ArrayList<>();
        habilidadTheDeep.add(CrearHabilidades.crearHabilidadDeHabilidadConAnimales());
        habilidadTheDeep.add(CrearHabilidades.crearHabilidadDeInmortal());
        seven7.setHabilidades(habilidadTheDeep);
        sevens.add(seven7);

        Seven seven8 = new Seven();
        seven8.setNombre("Mesmer");
        List<Habilidad> habilidadMesmer= new ArrayList<>();
        habilidadMesmer.add(CrearHabilidades.crearHabilidadDeHabilidadMental());
        seven8.setHabilidades(habilidadMesmer);
        sevens.add(seven8);

        Seven seven9 = new Seven();
        seven9.setNombre("Lamplighter");
        List<Habilidad> habilidadLamplighter= new ArrayList<>();
        habilidadLamplighter.add(CrearHabilidades.crearHabilidadDeManipulacionMaterial());
        seven9.setHabilidades(habilidadLamplighter);
        sevens.add(seven9);

        Seven seven10 = new Seven();
        seven10.setNombre("Translucent");
        List<Habilidad> habilidadTranslucent= new ArrayList<>();
        habilidadTranslucent.add(CrearHabilidades.crearHabilidadDeTransformacionl());
        seven10.setHabilidades(habilidadTranslucent);
        sevens.add(seven10);

        Seven seven11 = new Seven();
        seven11.setNombre("Shape-shifter");
        List<Habilidad> habilidadShapeShifter= new ArrayList<>();
        habilidadShapeShifter.add(CrearHabilidades.crearHabilidadDeTransformacionl());
        seven11.setHabilidades(habilidadShapeShifter);
        sevens.add(seven11);

        return sevens;
    }
}
