package business.abstracts;

import model.dto.UnitRequest;

public interface UnitService {

    int convertUnit(UnitRequest unitRequest) throws Exception;

}
