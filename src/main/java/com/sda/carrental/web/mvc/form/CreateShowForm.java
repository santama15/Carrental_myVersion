package com.sda.carrental.web.mvc.form;


import com.sda.carrental.model.property.Car;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateShowForm {

    private Car car_id;

    private CreateIndexForm indexData;
}
