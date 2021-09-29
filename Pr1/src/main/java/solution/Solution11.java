package solution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Solution11 {
    public static void main(String[] args) throws MalformedURLException {



    }
    private List<Integer> evenList(int[] arr)
    {
        List<Integer> list = new LinkedList<>();
        for(int numb : arr)
        {
            if(numb%2==0&&numb!=0)
            {
                list.add(numb);
            }
        }
        return list;
    }
    private int[] listToArrayint(List<Integer> list)
    {
        int[] arr = new int[list.size()];

        for(int i = 0; i< list.size(); i++ ) {
            arr[i] = list.get(i);
        }

       return arr;
    }

    public int[] evenArray(int[] array)
    {
        return listToArrayint(evenList(array));
    }

 }
