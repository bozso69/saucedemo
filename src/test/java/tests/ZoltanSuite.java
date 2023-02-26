package tests;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
/**
 * Warm-up teszt készlet.
 * 
* Lefuttatja a "tests" package-ben található minden olyan tesztet, 
* amelyik "ZoltanTest" tag-gel van ellátva.
 * 
*
 */
@Suite
@SuiteDisplayName("ZoltanTag")
@SelectPackages("tests")
@IncludeTags("ZoltanTest")

public class ZoltanSuite {

}
