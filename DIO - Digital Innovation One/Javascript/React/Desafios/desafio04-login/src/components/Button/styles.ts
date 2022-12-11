import styled, { css } from 'styled-components';


export const ButtonContainer = styled.button`
    width: 100%;
    height: 42px;
    background-color: #000000;
    color: #FFF;

    border: 1px solid #000000;
    border-radius: 21px;

    &:hover {
        opacity: 0.6;
        cursor:pointer;
    }

    ${({disabled}) => disabled === true && css`
    opacity: 0.6;
    
    &:hover {
        cursor:not-allowed;
    }
`}
`