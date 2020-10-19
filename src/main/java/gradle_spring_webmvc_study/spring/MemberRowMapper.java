package gradle_spring_webmvc_study.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;

import gradle_spring_webmvc_study.dto.Member;

public class MemberRowMapper implements RowMapper<Member> {
    @Override
    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        String email = rs.getString("EMAIL");
        String password = rs.getString("PASSWORD");
        String name = rs.getString("NAME");
        LocalDateTime registerDateTime = rs.getTimestamp("REGDATE").toLocalDateTime();
        
        Member member = new Member(email, password, name, registerDateTime);
        member.setId(rs.getLong("ID"));
        
        return member;
    }

}
