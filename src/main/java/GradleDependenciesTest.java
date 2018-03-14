import org.apache.commons.lang3.StringUtils;

public class GradleDependenciesTest {

    public static void main(String[] args) {
        String originalString = "Dawid Winiarski";
        System.out.print(StringUtils.reverse(originalString));
//        StringUtils
    }

}

//-Stworzyć projekt budowany Gradlem.  +
//-Doodać zależność od biblioteki apache.lang.commons
//      (lub dowolnej tego typu) w buildzie gradle’owym; +
//-użyć czegoś z tej biblioteki, +
//-stworzyć artefakt będący “fat-jarem” + CHYBA +
//      i zainstalować w lokalnym repo.                  dodałem go ręcznie ale
//                                                       chyba nie o to chodziło
//                                                      pewnie trzeba skrypt napisac
