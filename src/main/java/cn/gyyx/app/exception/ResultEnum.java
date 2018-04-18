/**  
 * @Title:  ResultEnum.java   
 * @Package cn.gyyx.app.enums   
 * @Description: Result 枚举类
 * @author: zhangguangxin@gyyx.cn
 * @date:   2017年12月4日 下午1:22:22   
 * @version V1.0 
 */
package cn.gyyx.app.exception;

public enum ResultEnum {
	
	SUCCESS(0, "成功"),
    ERROR_UNKONW(-1, "未知错误"),
    
    ERROR_USER_PASSWORD_ERROR(101, "密码不正确"),
    ERROR_USER_NONENTITY(102, "用户名不存在"),
    ERROR_USER_EXITED(103, "用户名已存在"),
    ERROR_USER_DELETE(104, "用户删除失败"),
    ERROR_USER_FIND(105, "用户获取失败"),
    
    ERROR_TOKEN_ILLEGAL(201, "不合法的Authorization header"),
    ERROR_TOKEN_INVALID(202, "无效的token"),
    ERROR_TOKEN_TIMEOUT(203, "token已超时"),
    
    ERROR_AUTH_VALID(301, "没有此资源访问权限"),
    
    ERROR_APP_EXITED(401, "应用已存在"),
    ERROR_APP_INSERT(402, "应用新增失败"),
    ERROR_APP_DELETE(403, "应用删除失败"),
    
    ERROR_APP_ROLE_EXITED(501, "应用角色已存在"),
    ERROR_APP_ROLE_UPDATE(502, "应用角色更新失败"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
