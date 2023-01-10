package com.restful.booker.cucumber.steps;


import com.restful.booker.model.BookingPojo;
import com.restful.booker.restfulinfo.RestfulSteps;
import com.restful.booker.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;


@Concurrent(threads = "2x")
@UseTestDataFrom("src/test/java/resources/testdata/bookinginfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class CreateBookingDataDrivenTest extends TestBase {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingPojo.BookingDates bookingdates;
    private String additionalneeds;

    @Steps
    RestfulSteps restfulSteps;

    @Title("Data driven test for adding multiple users to the application")
    @Test
    public void createMultipleUsers(){
        restfulSteps.createBooking(firstname,lastname,totalprice,depositpaid,bookingdates,additionalneeds).statusCode(200);
    }
}
