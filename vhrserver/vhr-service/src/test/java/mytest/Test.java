package mytest;

import com.vhr.mapper.MenuMapper;
import com.vhr.model.Menu;
import com.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


public class Test {

    @Autowired
    MenuService menuService;

    @Autowired
    MenuMapper menuMapper;

    @org.junit.jupiter.api.Test
    public void test() {
        List<Menu> allMenus = menuMapper.getAllMenus();
        System.out.println(
                allMenus);
    }

}
