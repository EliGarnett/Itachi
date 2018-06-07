package priv.eli.Itachi.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Eli
 * @date 2018/6/6
 */
@Getter
@AllArgsConstructor
public enum ItachiError {
    INNER_ERROR(100000001, "服务器内部异常"),
    ADD_ERROR(100100001, "创建错误");
    private Integer code;

    private String message;

}
