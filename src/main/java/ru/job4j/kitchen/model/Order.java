package ru.job4j.kitchen.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Order - модель данных, описывабщая заказ
 *
 * @author Ilya Kaltygin
 */
@Data
@Entity(name = "job4j_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int dishId;
}
