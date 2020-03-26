import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import restoms.controllers.OrderController;
import restoms.dao.CORSFilter;
import restoms.dao.OmsOrder;
import restoms.dao.OrderRepository;
import restoms.exceptions.OrderException;
import restoms.service.OrderService;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


//@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(OrderController.class)
public class OMSTests {

    private MockMvc mockMvc;

    @Mock
    private OrderService orderService;

    @InjectMocks
    private OrderController orderController;
    @MockBean
    private OrderRepository repository;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(orderController)
                .addFilters(new CORSFilter())
                .build();
    }

    @Test
    public void test_get_by_id_success() throws Exception {
        OmsOrder order = new OmsOrder("100", "amzn", 4, 200, "A","bharat",
                "bh@gh.com");

        when(orderService.getOrder("100")).thenReturn(order);
        OmsOrder result= orderService.getOrder("100");
        assertThat(result.getEmail()).isEqualTo("bh@gh.com");

    }
    @Test
    public void createOrder() {
        OmsOrder order= new OmsOrder("101", "amzn", 4, 200, "A","bharat",
                "bh@gh.com");
        when(repository.save(order)).thenReturn(order);
        assertEquals(order, repository.save(order));
    }


@SuppressWarnings("deprecation")
@Test
public void testGetOrderSuccessPath() throws URISyntaxException {
    RestTemplate restTemplate = new RestTemplate();


    final String baseUrl = "http://localhost:8080/orders/" +"8e765fac-d2fe-4420-9b31-a1f028319645";
    URI uri = new URI(baseUrl);
    //http://localhost:8080/orders/id
    ResponseEntity<OmsOrder> result =
            restTemplate.getForEntity(uri, OmsOrder.class);

    //Verify request succeed Assert.assertEquals(200,
    result.getStatusCodeValue();
    Assert.assertEquals("sharat",
            result.getBody().getUserName());
}

}

