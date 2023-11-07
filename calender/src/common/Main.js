import '../css/Main.css'

export default function Main() {
    return(
        <>
            <div className="content-box">
                <div className="menu-box">
                    <div className="menu-item"><a href="#">일정관리</a></div>
                    <div className="menu-item"><a href="#">팀 관리</a></div>
                    <div className="menu-item"><a href="#">공간 대여</a></div>
                </div>

                <div className="menu-box">
                    <div className="calendar">
                        <div className="date-selector">
                            <input type="date" className="event-input" />
                        </div>
                    </div>
                </div>

    
                <div class="notice-box">
                    <div class="notice-item">공지사항 내용</div>
                    <div class="notice-item">공지사항 내용</div>
                    <div class="notice-item">공지사항 내용</div>
                </div>
            </div>
            <div class="menu-box">
                <div class="event-input-box">
                    <label for="event">일정 입력:</label>
                    <input type="text" id="event" class="event-input" placeholder="일정을 입력하세요" />
                    <button class="add-event-button">추가</button>
                </div>
            </div>
    </>
    )
}