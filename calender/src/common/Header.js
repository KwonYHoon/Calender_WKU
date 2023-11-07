import React from 'react'
import '../css/Header.css'

export default function Header() {
    return (
        <>
        <div className="header">
            <div className="logo">LOGO글씨</div>
            <div className="search-box">
                <input type="text" class="search-input" placeholder="검색어를 입력하세요" />
                <button class="search-button">검색</button>
            </div>
            <ul className="nav-links">
                <li><a href="/" style={{color:'white'}}>HOME</a></li>
                <li><a href="/login" style={{color:'white'}}> 로그인</a></li>
                <li><a href="/signup" style={{color:'white'}}>회원가입</a></li>
            </ul>
        </div>
        </>
    )
}