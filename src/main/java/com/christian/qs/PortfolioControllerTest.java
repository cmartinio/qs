package com.christian.qs;

import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.Collection;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

@SuppressWarnings("unchecked")
public class PortfolioControllerTest {

    @Test
    public void givenOpenPositionViewReturnsPosition() throws Exception {
        PortfolioController portfolioController = new PortfolioController();

        Model model = new ConcurrentModel();
        portfolioController.viewPortfolio(model);

        Collection<String> positions = (Collection<String> model.getAttribute("position"));

        assertThat(positions)
                .contains("AAPL   |  C  |   1 | Oct 16 20  | 125.00 |      6.40 |     640.00 |         6.35  | 635.00 |   ($5.00) |   (8%)  |");
    }

}
