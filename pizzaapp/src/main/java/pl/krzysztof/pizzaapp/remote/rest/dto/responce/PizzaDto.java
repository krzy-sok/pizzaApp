package pl.krzysztof.pizzaapp.remote.rest.dto.responce;

import java.util.List;

public class PizzaDto {
    private Integer id;
    private String name;
    private List<SizeDto> size;

    public PizzaDto() {
    }

    public PizzaDto(Integer id, String name, List<SizeDto> size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSize() {
        return size;
    }

    public void setSize(List<SizeDto> size) {
        this.size = size;
    }
}
