package net.ultrasist.capacitacion.chambeaya.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MapperException extends ServiceException {
    private static final long serialVersionUID = -5568663380053331569L;
    private int internalCode;
    private String userCode;
    private String userInfo;
    private String internalInfo;
}