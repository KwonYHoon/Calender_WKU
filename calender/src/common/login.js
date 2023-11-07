import React from 'react';
import '../css/Login.css'
import { Link, useLocation } from 'react-router-dom';

export default function login() {
    return (
        <div id="con">
            <div id="login">
                <div id="login_form">
                    <form>
                        <h3 class="login">로그인</h3>
                        <hr/>
                        <label>
                            <p>회원아이디</p>
                            <input type="text" placeholder="아이디를 입력" class="size" />
                        </label>

                        <label>
                            <p>비밀번호 </p>
                            <input type="text" placeholder="비밀번호를 입력" class="size" />
                        </label>

                        <p>
                            <input type="submit" value="Sign in" class="btn" />
                        </p>
                    </form>
                    <hr />
                    <p class="find"> 
                        <Link to={"/"}><span><a href="#">아이디 찾기</a></span></Link>
                        <Link to={"/"}><span><a href="#">비밀번호 찾기</a></span></Link>
                        <Link to={"/signup"}><span><a href="#" >회원가입</a></span></Link>
                    </p>
                </div>
            </div>
        </div>
    )
}