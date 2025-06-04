package member;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Map;

import book.BookVO;
import member.file.FileMemberDB;

public class ObjFileHashMapMemberDAO extends HashMapMemberDAO implements FileMemberDB{

	private String dataFilename = DATA_FILE + ".obj";
	public ObjFileHashMapMemberDAO () {
		loadMembers();
	}
	
	@Override
	public void saveMembers() {
		
		try (
				FileOutputStream fos = new FileOutputStream(dataFilename);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
				oos.writeObject(memberDB);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void loadMembers() {
		
		try (
				
				FileInputStream fis = new FileInputStream(dataFilename);
				ObjectInputStream ois = new ObjectInputStream(fis); 
			) {
			
			memberDB = (Map<String, MemberVO>)ois.readObject();
			for (MemberVO member : memberDB.values()) {
				if (member.getMemberNo() >= memberSeq)
					memberSeq = member.getMemberNo() + 1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("[DB 로딩] " + dataFilename + "가 없습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public boolean insertMember(MemberVO member) {
		boolean result = super.insertMember(member);
		if (result) saveMembers();
		return result;
	}
	
	@Override
	public boolean updateMember(MemberVO newMember) {
		boolean result = super.updateMember(newMember);
		if (result) saveMembers();
		return result;
	}
	
	@Override
	public boolean deleteBook(int bookNo) {
		boolean result = super.deleteBook(bookNo);
		if (result) saveBooks();
		return result;
	}
	
}
