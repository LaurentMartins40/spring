package com.training.springcore.service;

import com.training.springcore.model.Captor;
import com.training.springcore.service.measure.FixedMeasureService;
import com.training.springcore.service.measure.RealMeasureService;
import com.training.springcore.service.measure.SimulatedMeasureService;
import com.training.springcore.utils.OutputCapture;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
public class CaptorServiceImplTest {


    private CaptorServiceImpl captorService = new CaptorServiceImpl(new FixedMeasureService(),new SimulatedMeasureService(),new RealMeasureService());


    @Test
    public void findBySiteShouldReturnNullWhenIdIsNull() {
        // Initialisation
        String siteId = null;

        // Appel du SUT
        Set<Captor> captors = captorService.findBySite(siteId);

        // Vérification
        Assertions.assertThat(captors).isEmpty();
    }

    @Test
    public void findBySite() {
        // Initialisation
        String siteId = "siteId";

        // Appel du SUT
        Set<Captor> captors = captorService.findBySite(siteId);

        // Vérification
        Assertions.assertThat(captors).hasSize(1);
        Assertions.assertThat(captors).extracting(Captor::getName).contains("Capteur A");
    }
}