package cn.gyyx.app.exception;/**
 * @Author : east.Fu
 * @Description :
 * @Date : Created in  2018/4/17 17:09
 */

import cn.gyyx.app.model.Result;
import cn.gyyx.app.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author
 * @create 2018-04-17 17:09
 **/
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Result<Object> handle(Exception e) {
        if (e instanceof AppException) {
            AppException appException = (AppException) e;
            return ResultUtil.error(appException.getCode(), appException.getMessage());
        }else {
            logger.error("【系统异常】", e);
            return ResultUtil.error(-1, e.getMessage());
        }
    }
}
