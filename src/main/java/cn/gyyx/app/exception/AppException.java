/**  
 * @Title:  AppException.java   
 * @Package cn.gyyx.app.exception   
 * @Description: 异常处理类，统一异常处理  
 * @author: zhangguangxin@gyyx.cn
 * @date:   2017年12月4日 下午1:33:15   
 * @version V1.0 
 */
package cn.gyyx.app.exception;

public class AppException extends RuntimeException{

	private static final long serialVersionUID = -2147107150574486659L;
	private Integer code;

    public AppException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
