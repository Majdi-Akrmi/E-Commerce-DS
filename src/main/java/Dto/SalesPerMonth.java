package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor

public class SalesPerMonth {
    private int year;
    private int month;
    private Double totalSales;
}
