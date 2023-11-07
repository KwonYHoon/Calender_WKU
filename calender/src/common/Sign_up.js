import '../css/Sign_up.css'

export default function Signup() {
    return (
        <div id="con">
            <div id="login">
                <div id="login_form">
                    <form>
                        <h3 class="login">회원가입</h3>
                        <hr/>
                        <p>회원아이디</p>
                        <input type="text" placeholder="아이디" class="size" />
                        <p></p>

                        <label>
                            <p>비밀번호 </p>
                            <input type="password" placeholder="비밀번호" class="size" />
                        </label>

                        <label>
                            <p> </p>
                            <input type="password" placeholder="비밀번호 확인" class="size" />
                        </label>

                        <label>
                            <p>휴대폰번호</p>
                            <select class="size num1">
                                <option value="1" selected>SKT</option>
                                <option value="2" selected>KT</option>
                                <option value="3" selected>LG</option>
                            </select>
                            <input placeholder="-빼고 숫자만 입력"  class="size num2" required />
                        </label>
         
                        <label>
                            <p>E-mail</p>
                            <input type="text" placeholder="이메일" class="size" />
                        </label>
                        <br/>
                        <p>
                            <input type="submit" value="Create Acoout" class="btn" />
                        </p>
                    </form>

                    <hr />
                    <p class="find">
                        <span><a href="/login" >로그인 페이지로 이동</a></span>
                    </p>
                </div>
            </div>
        </div>
    );
}