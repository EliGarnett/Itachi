package priv.eli.Itachi.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eli
 * @date 2018/8/3
 */
@RestController
@RequestMapping(value = "/swggar")
@Api("SwggarController相关的api")
public class SwaggerController {

    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "username", dataType = "String", required = true, value =
                    "用户姓名", defaultValue = "zhangsan"),
            @ApiImplicitParam(paramType = "query", name = "password", dataType = "String", required = true, value =
                    "用户密码", defaultValue = "123456")})
    @ApiResponses({
            @ApiResponse(code = 404, message = "请求路径不对"),
            @ApiResponse(code = 400, message = "请求参数不正确")
    })

    @GetMapping(name = "用户信息接口", value = "/userInfo")
    public void getUserInfo(@RequestHeader(value = "username") String userName,
            @RequestParam("password") String password) {
        System.out.println("username : " + userName + "; password : " + password);
    }
}
