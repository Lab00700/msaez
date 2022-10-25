package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;

    public Shipped(Shipping aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
