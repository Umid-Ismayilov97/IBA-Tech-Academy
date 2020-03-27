package homework10;

import homework10.controller.FamilyController;

import homework10.dao.CollectionFamilyDAO;

import homework10.entity.Family;

import homework10.entity.Human;

import homework10.entity.Man;

import homework10.entity.Woman;

import homework10.entity.pets.Dog;

import homework10.entity.pets.DomesticCat;

import homework10.util.RandomComponents;

import homework6.DayOfWeek;


import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.time.Instant;

import java.time.LocalDate;

import java.time.ZoneId;

import java.time.format.DateTimeFormatter;

import java.util.Date;

import java.util.HashMap;

import java.util.Map;

import java.util.logging.SimpleFormatter;


public class Main {

    public static void main(String[] args) {

        Human adoptedChild = new Human("Carl","Grimes",2002,18,90);

        System.out.println(adoptedChild);

    }

}