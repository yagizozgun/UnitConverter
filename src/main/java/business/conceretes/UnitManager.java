package business.conceretes;

import business.abstracts.UnitService;
import model.dto.UnitRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UnitManager implements UnitService {
    @Override
    public int convertUnit(UnitRequest unitRequest) throws Exception {
        if ("cm".equals(unitRequest.getFromUnit()) && "mm".equals(unitRequest.getToUnit()))
            return unitRequest.getValue() * 10;
        else
            throw new Exception("Convert Unit Problem");
    }
}
