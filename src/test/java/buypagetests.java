import chrome.Retry;
import chrome.chromrunner1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import stepobjects.buysteps;


import static com.codeborne.selenide.Selenide.$;
@Listeners(chrome.TestLister.class)
public class buypagetests extends chromrunner1 {
    @Test(retryAnalyzer= Retry.class)

    public void test1() {
        buysteps steps = new buysteps();
        steps
                .clickbuy()
                .Cklikbuy()
                .Chekfirtssteppage()
                .setname("MIU")
                .Continp()
                .Cklikbutage()
                .setpetage("1 თვე")
                .setcolor("white")
                .Setpetvar()
                .Chang("ბიგლი")
                .clickcomtiniue();
    }
    @Test(retryAnalyzer= Retry.class)

    public void test6() {
        buysteps steps = new buysteps();
        steps
                .clickbuy()
                .Cklikbuy()
                .Chekfirtssteppage()
                .Continp()
                .Chekerormesfirstst()
                .setname("MIU")
                .Continp()
                .setcoloringclick()
                .setpetage("1 თვე")
                .TextcollisNecessary();

}
}
