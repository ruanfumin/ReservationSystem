package manage.impl;

import dao.FlightDao;
import dao.impl.FlightDaoImpl;
import entity.Flight;
import exception.FlightException;
import manage.FlightManage;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: 我的袜子都是洞
 * @description:
 * @path: ReservationSystem-manage.impl-FlightManageImpl
 * @date: 2019-01-20 16:08
 */
public class FlightManageImpl implements FlightManage {

    /**
     * 获取航班信息
     *
     * @return
     */
    @Override
    public List<Flight> listFlight() throws FlightException {
        FlightDao flightDao = new FlightDaoImpl();
        try {
            List<Flight> flights = flightDao.listFlight();
            return flights;
        } catch (SQLException e) {
            throw new FlightException("没有航班信息");
        }
    }

    /**
     * 修改航班信息
     *
     * @param flight
     * @return
     * @throws FlightException
     */
    @Override
    public boolean updateFlight(Flight flight) throws FlightException {
        return false;
    }

    /**
     * 增加航班信息
     *
     * @param flight
     * @return
     * @throws FlightException
     */
    @Override
    public boolean saveFlight(Flight flight) throws FlightException {
        return false;
    }
}
