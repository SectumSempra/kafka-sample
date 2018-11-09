package com.be.kafkasample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.be.kafkasample.config.kafka.consumer.CustomConsumer;
import com.be.kafkasample.config.kafka.producer.CustomProducer;
import com.be.kafkasample.model.Employee;
import com.be.kafkasample.model.Region;
import com.be.kafkasample.repository.EmployeeRepository;
import com.be.kafkasample.repository.RegionRepository;

@Controller
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class KafkaTestController {

    @Autowired
    CustomProducer producer;

    @Autowired
    CustomConsumer consumer;

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    RegionRepository regionRepository;

    @RequestMapping(value = "/region-all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< ? > regionAll() {

        return new ResponseEntity<>(regionRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/produce/{val}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< ? > produceVal(@PathVariable("val") String val) {
        producer.sendMessage(val);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/produce-emp/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< ? > produceEmpVal(@PathVariable("id") Integer id) {
        Employee model = employeeRepository.findById(id).get();
        producer.sendMessage("topic-emp", model);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/consume-all", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity< ? > getConsumeAll() {

        return new ResponseEntity<>(consumer.messageList, HttpStatus.OK);
    }

    @RequestMapping(value = "/create-region", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity< ? > produceEmpVal(@RequestBody Region region) {
        producer.sendMessage("topic-region", region);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
